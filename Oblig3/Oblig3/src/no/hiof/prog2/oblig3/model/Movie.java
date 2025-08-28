package no.hiof.prog2.oblig3.model;

import java.time.LocalDate;

public class Movie extends Production {

    public Movie(String title, int runtimeInMinutes, LocalDate releaseDate, String description) {
        super(title, runtimeInMinutes, releaseDate, description);
    }

    public Movie(String title, int runtimeInMinutes) {
        super(title, runtimeInMinutes);
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() +
                ", Runtime: " + getRuntimeInMinutes() + " minutes" +
                (getReleaseDate() != null ? ", Release Date: " + getReleaseDate() : "") +
                (getDescription() != null ? ", Description: " + getDescription() : "") +
                (getDirector() != null ? ", Directed by: " + getDirector().getFullName() : "");
    }
}