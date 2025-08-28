public class Episode {
    private String title;
    private int episodeNumber;
    private int seasonNumber;
    private int runtime;

    public Episode(String title, int episodeNumber, int seasonNumber) {
        this(title, episodeNumber, seasonNumber, 0);
    }

    public Episode(String title, int episodeNumber, int seasonNumber, int runtime) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtime = runtime;
    }

    public String getTitle() { return title; }
    public int getEpisodeNumber() { return episodeNumber; }
    public int getSeasonNumber() { return seasonNumber; }
    public int getRuntime() { return runtime; }
    public void setRuntime(int runtime) { this.runtime = runtime; }

    @Override
    public String toString() {
        return "Episode title: " + title + "\nEpisode number: " + episodeNumber +
                "\nSeason number: " + seasonNumber + "\nRuntime in minutes: " + runtime;
    }
}