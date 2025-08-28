package no.hiof.prog2.oblig.model;

import java.time.LocalDate;
import java.util.ArrayList;

// Oppgave 2.1
public abstract class Production {

    private String title;
    private String description;
    private int runtimeInMinutes;
    private LocalDate releaseDate;
    private Person director;
    private ArrayList<Role> roles = new ArrayList<>();

    public Production(String title) {
        this.title = title;
    }

    public Production(String title, String description, int runtimeInMinutes, LocalDate releaseDate) {
        this.title = title;
        this.description = description;
        this.runtimeInMinutes = runtimeInMinutes;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nDescription: " + description +
                "\nRuntime in minutes: " + runtimeInMinutes +
                "\nRelease Date: " + releaseDate +
                "\nDirector: " + (director != null ? director.getFullName() : "N/A");
    }

    public ArrayList<Role> getRoles() {
        return new ArrayList<>(roles);
    }

    public void addToRoles(Role role) {
        roles.add(role);
    }

    public void addToRoles(ArrayList<Role> listOfRoles) {
        roles.addAll(listOfRoles);
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

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }
}