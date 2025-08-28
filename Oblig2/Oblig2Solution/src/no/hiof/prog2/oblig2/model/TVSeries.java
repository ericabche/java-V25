package no.hiof.prog2.oblig2.model;

import java.time.LocalDate;
import java.util.ArrayList;

/*
Oppgave 2.1
 */
public class TVSeries {

    /*
    Oppgave 2.1
     */
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes = new ArrayList<>();

    /*
    Oppgave 2.5
     */
    private double averageRuntime;
    /*
    Oppgave 2.7
     */
    private int numSeasons = 0;

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    /*
    Oppgave 2.4
     */
    public ArrayList<Episode> getEpisodesInSeason(int season) {
        ArrayList<Episode> episodesInSeason = new ArrayList<>();
        for (Episode episode : episodes) {
            if (episode.getSeasonNumber() == season) {
                episodesInSeason.add(episode);
            }
        }
        return episodesInSeason;
    }

    /*
    Used to add a single episode at a time to the list of episodes.
    2.7 Checks that the season is acceptable
     */
    public void addEpisode(Episode episode) {
        int episodeSeasonNumber = episode.getSeasonNumber();

        /*
        Oppgave 2.7 - Restricts adding episodes to max one season higher than the current. Updates numSeasons if
        necessary.
         */
        if (episodeSeasonNumber != numSeasons && episodeSeasonNumber != numSeasons+1) {
            System.out.println("Can't add episode for season " + episode.getSeasonNumber() + " when only " +
                    numSeasons + " exists.");
        }
        else {
            episodes.add(episode);
            updateAverageRuntime(); // Oppgave 2.5
        }

        if (episodeSeasonNumber == numSeasons+1) {
            numSeasons++;
        }

    }

    /*
    Oppgave 2.5
     */
    public void updateAverageRuntime() {
        int sumRunTime = 0;
        for (Episode episode : episodes) {
            sumRunTime += episode.getRuntimeInMinutes();
        }
        averageRuntime = (double) sumRunTime / episodes.size();
    }

    /*
    Oppgave 2.3
     */
    @Override
    public String toString() {
        return "TV series title: " + title +
                "\nDescription: " + description +
                "\nRelease date: " + releaseDate.toString() +
                "\nNumber of episodes: " + episodes.size();
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

    public double getAverageRuntime() {
        return averageRuntime;
    }

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<>(episodes);
    }

    public int getNumSeasons() {
        return numSeasons;
    }
}
