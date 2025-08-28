package no.hiof.prog2.oblig2.model;

/*
Oppgave 2.1
 */
public class Episode {

    /*
    Oppgave 2.1
     */
    private String title;
    private int episodeNumber;
    private int seasonNumber;
    private int runtimeInMinutes;

    /*
    Oppgave 2.1
     */
    public Episode(String title, int episodeNumber, int seasonNumber, int runtimeInMinutes) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
        this.runtimeInMinutes = runtimeInMinutes;
    }

    /*
    Oppgave 2.1
     */
    public Episode(String title, int episodeNumber, int seasonNumber) {
        this.title = title;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    /*
    Oppgave 2.3
     */
    @Override
    public String toString() {
        return "Episode title: " + title +
                "\nEpisode number: " + episodeNumber +
                "\nSeason number: " + seasonNumber +
                "\nRuntime in minutes: " + runtimeInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }
}
