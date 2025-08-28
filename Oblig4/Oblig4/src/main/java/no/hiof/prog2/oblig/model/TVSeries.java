package no.hiof.prog2.oblig.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes = new ArrayList<>();

    public TVSeries() {
    }

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
    }

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<>(episodes);
    }

    public ArrayList<Role> getCast() {
        ArrayList<Role> cast = new ArrayList<>();

        for (Episode episode : episodes) {
            cast.addAll(episode.getRoles());
        }

        return cast;
    }

    public int numberOfEpisodesWithActor(Person actor) {
        int count = 0;

        for (Episode episode : episodes) {
            for (Role role : episode.getRoles()) {
                if (role.getActor().equals(actor)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public ArrayList<Episode> getEpisodesInSeason(int season) {
        ArrayList<Episode> episodesInSeason = new ArrayList<>();

        for (Episode episode : episodes) {
            if (episode.getSeasonNumber() == season) {
                episodesInSeason.add(episode);
            }
        }

        return episodesInSeason;
    }

    @Override
    public String toString() {
        return "\nTV Series Title: " + title +
                "\nDescription: " + description +
                "\nRelease Date: " + releaseDate +
                "\n----------------------------------";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}