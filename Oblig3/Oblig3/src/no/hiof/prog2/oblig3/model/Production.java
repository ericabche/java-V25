package no.hiof.prog2.oblig3.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Production {
    private String title;
    private int runtimeInMinutes;
    private LocalDate releaseDate;
    private String description;
    private Person director;
    private List<Role> roles;

    // 🔹 Konstruktør som setter alle verdier
    public Production(String title, int runtimeInMinutes, LocalDate releaseDate, String description) {
        this.title = title;
        this.runtimeInMinutes = runtimeInMinutes;
        this.releaseDate = releaseDate;
        this.description = description;
        this.roles = new ArrayList<>();
    }

    // 🔹 Konstruktør med kun tittel og runtime
    public Production(String title, int runtimeInMinutes) {
        this(title, runtimeInMinutes, null, null);
    }

    // 🔹 Konstruktør med kun tittel
    public Production(String title) {
        this(title, 0, null, null);
    }

    // ✅ Get- og set-metoder
    public String getTitle() {
        return title;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public Person getDirector() {
        return director;
    }

    public List<Role> getRoles() {
        return new ArrayList<>(roles);
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    // ✅ Legg til roller
    public void addToRoles(Role role) {
        roles.add(role);
    }

    public void addToRoles(List<Role> listOfRoles) {
        roles.addAll(listOfRoles);
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Runtime: " + runtimeInMinutes + " minutes" +
                (releaseDate != null ? ", Release Date: " + releaseDate : "") +
                (description != null ? ", Description: " + description : "") +
                (director != null ? ", Directed by: " + director.getFullName() : "");
    }
}