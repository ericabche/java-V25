import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes;
    private int numSeasons;
    private double averageRunTime;

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.episodes = new ArrayList<>();
        this.numSeasons = 0;
    }

    public void addEpisode(Episode episode) {
        if (episode.getSeasonNumber() > numSeasons + 1) {
            System.out.println("Error: Cannot add episode to season " + episode.getSeasonNumber() +
            ". The highest registered season is " + numSeasons);
            return;
        }
        episodes.add(episode);
        if (episode.getSeasonNumber() > numSeasons) {
            numSeasons = episode.getSeasonNumber();
        }
        updateAverageRuntime();
    }

    private void updateAverageRuntime() {
        int totalRuntime = 0;

        for (Episode episode : episodes) {
            totalRuntime += episode.getRuntime();
        }

        averageRunTime = episodes.isEmpty() ? 0 : (double) totalRuntime / episodes.size();
    }

    public ArrayList<Episode> getEpisodesInSeason(int season) {
        ArrayList<Episode> seasonEpisodes = new ArrayList<>();
        for (Episode ep : episodes) {
            if (ep.getSeasonNumber() == season) {
                seasonEpisodes.add(ep);
            }
        }
        return seasonEpisodes;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public LocalDate getReleaseDate() {return releaseDate;}
    public void setReleaseDate(LocalDate releaseDate) {this.releaseDate = releaseDate;}

    public double getAverageRunTime() {
        return averageRunTime;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<>(episodes);
    }

    @Override
    public String toString() {
        return "TV series Title: " + title + "\nDescription: " + description + "\nRelease date: "
                + releaseDate + "\nNumber of episodes: " + episodes.size();
    }

}
