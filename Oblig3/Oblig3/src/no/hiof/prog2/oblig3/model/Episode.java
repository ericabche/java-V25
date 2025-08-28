package no.hiof.prog2.oblig3.model;

public class Episode extends Production {
    private int episodeNumber;
    private int seasonNumber;

    public Episode(String title, int episodeNumber, int seasonNumber, int runtimeInMinutes) {
        super(title, runtimeInMinutes);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

    public Episode(String title, int episodeNumber, int seasonNumber) {
        super(title);
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
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

    @Override
    public String toString() {
        return "Episode title: " + getTitle() +
                "\nEpisode number: " + episodeNumber +
                "\nSeason number: " + seasonNumber +
                "\nRuntime in minutes: " + getRuntimeInMinutes() +
                (getDirector() != null ? "\nDirected by: " + getDirector().getFullName() : "");
    }
}