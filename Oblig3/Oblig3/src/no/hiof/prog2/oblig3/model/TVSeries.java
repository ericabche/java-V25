package no.hiof.prog2.oblig3.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TVSeries {
    private String title;
    private String description;
    private LocalDate releaseDate;
    private ArrayList<Episode> episodes = new ArrayList<>();

    public TVSeries(String title, String description, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public List<Role> hentRollebesetning() {
        List<Role> allRoles = new ArrayList<>();
        for (Episode episode : episodes) {
            allRoles.addAll(episode.getRoles());
        }
        return allRoles;
    }

    @Override
    public String toString() {
        return "TV Series: " + title +
                "\nDescription: " + description +
                "\nRelease Date: " + releaseDate +
                "\nNumber of Episodes: " + episodes.size();
    }
}