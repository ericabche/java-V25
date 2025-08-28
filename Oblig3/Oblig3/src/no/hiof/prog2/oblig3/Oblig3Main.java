package no.hiof.prog2.oblig3;

import no.hiof.prog2.oblig3.model.*;

import java.time.LocalDate;
import java.util.List;

public class Oblig3Main {
    public static void main(String[] args) {

        //Oppgave 2.2
        Movie theShawshankRedemption = new Movie("The Shawshank Redemption", 142, LocalDate.of(1995, 1, 6),
                "\nA banker convicted of uxoricide forms a friendship over a quarter century with a hardened convict.");

        Movie fightClub = new Movie("Fight Club", 139, LocalDate.of(1999, 10, 15),
                "\nAn insomniac office worker and a soap maker form an underground fight club.");

        System.out.println("\nMovies:");
        System.out.println("\n" + theShawshankRedemption);
        System.out.println("\n" + fightClub);

        System.out.println("\n---------------------------------------------------------------------");

        // Oppgave 2.4
        Person denisVilleneuve = new Person("Denis", "Villeneuve");
        Movie dunePartOne = new Movie("Dune Part One", 155, LocalDate.of(2021, 10, 22),
                "\nA noble family becomes embroiled in a war for control over the galaxy's most valuable asset.");
        dunePartOne.setDirector(denisVilleneuve);

        System.out.println("\nFilm:");
        System.out.println(dunePartOne.getTitle());
        System.out.println("Director of Dune: Part One: " + dunePartOne.getDirector().getFullName());

        Person brettRatner = new Person("Brett", "Ratner");
        Episode episode5 = new Episode("English, Fitz or Percy", 5, 1, 45);
        episode5.setDirector(brettRatner);

        System.out.println("\nEpisode:");
        System.out.println(episode5);
        System.out.println("Director of Prison Break - Pilot: " + episode5.getDirector().getFullName());

        System.out.println("\n---------------------------------------------------------------------");

        // Oppgave 2.5
        Person edwardNorton = new Person("Edward", "Norton");
        Person bradPitt = new Person("Brad", "Pitt");
        Person helenaBonhamCarter = new Person("Helena Bonham", "Carter");

        Role theNarrator = new Role("The", "Narrator", edwardNorton);
        Role tylerDurden = new Role("Tyler", "Durden", bradPitt);
        Role marlaSinger = new Role("Marla", "Singer", helenaBonhamCarter);

        fightClub.addToRoles(theNarrator);
        fightClub.addToRoles(tylerDurden);
        fightClub.addToRoles(marlaSinger);

        System.out.println("\nRoles in Fight Club:");
        for (Role role : fightClub.getRoles()) {
            System.out.println(role);
        }

        System.out.println("\n---------------------------------------------------------------------");

        // Oppgave 2.7
        TVSeries prisonBreak = new TVSeries("Prison Break",
                "A man tries to break his brother out of prison.",
                LocalDate.of(2005, 8, 29));

        Person wentworthMiller = new Person("Wentworth", "Miller");
        Person dominicPurcell = new Person("Dominic", "Purcell");
        Person robertKnepper = new Person("Robert", "Knepper");
        Person amauryNolasco = new Person("Amury", "Nolas");

        Role michaelScofield = new Role("Michael", "Scofield", wentworthMiller);
        Role lincolnBurrows = new Role("Lincoln", "Burrows", dominicPurcell);
        Role theodoreBagwell = new Role("Theodore", "Bagwell", robertKnepper);
        Role fernandoSucre = new Role("Fernando", "Sucre", amauryNolasco);

        Episode episode1 = new Episode("Pilot", 1, 1, 60);
        episode1.addToRoles(michaelScofield);
        episode1.addToRoles(lincolnBurrows);
        episode1.addToRoles(fernandoSucre);

        Episode episode2 = new Episode("Allen", 2, 1, 45);
        episode2.addToRoles(michaelScofield);
        episode2.addToRoles(theodoreBagwell);
        episode2.addToRoles(theodoreBagwell);
        episode2.addToRoles(fernandoSucre);

        prisonBreak.addEpisode(episode1);
        prisonBreak.addEpisode(episode2);

        System.out.println("\nTV Series:");
        System.out.println(prisonBreak);

        System.out.println("\nFull Cast in Prison Break:");
        List<Role> prisonBreakCast = prisonBreak.hentRollebesetning();
        for (Role role : prisonBreakCast) {
            System.out.println(role);
        }
    }
}