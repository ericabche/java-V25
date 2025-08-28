package no.hiof.prog2.oblig2;

import no.hiof.prog2.oblig2.model.Episode;
import no.hiof.prog2.oblig2.model.TVSeries;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
        Oppgave 2.2
         */
        TVSeries hannibal = new TVSeries("Hannibal", "Whacky cannibal woo-hoo man adventures.",
                LocalDate.of(2013, 4, 4));

        Episode aperitif = new Episode("Apéritif", 1, 1, 42);
        hannibal.addEpisode(aperitif);

        Episode amuseBouche = new Episode("Amuse-Bouche", 2, 1, 42);
        hannibal.addEpisode(amuseBouche);

        Episode potage = new Episode("Potage", 3, 1, 42);
        hannibal.addEpisode(potage);

        Episode kaiseki = new Episode("Kaiseki", 1, 2, 42);
        hannibal.addEpisode(kaiseki);

        Episode sakizuke = new Episode("Sakizuke", 2, 2, 42);
        hannibal.addEpisode(sakizuke);

        Episode antipasto = new Episode("Antipasto", 1, 3, 43);
        hannibal.addEpisode(antipasto);

        Episode primavera = new Episode("Primavera", 2, 3, 44);
        hannibal.addEpisode(primavera);


        /*
        Oppgave 2.3
        Print descriptions TVSeries and Episodes
         */
        System.out.println(hannibal + "\n");
        System.out.println(aperitif + "\n");
        System.out.println(amuseBouche + "\n");
        System.out.println(potage + "\n");

        /*
        Oppgave 2.4
         */
        TVSeries tvSeries = new TVSeries("Generic TV Series", "?",
                LocalDate.of(2000, 1, 3));

        Random random = new Random();
        for (int season = 1; season <= 5; season++) {
            for (int episode = 1; episode <= 10; episode++) {
                String episodeName = "S" + season + " Episode " + episode;
                /*
                Oppgave 2.6
                Random runtime.
                 */
                tvSeries.addEpisode(new Episode(episodeName, episode, season, random.nextInt(20, 31)));
            }
        }
        /*
        Oppgave 2.8
        Tests addEpisode season control functionality.
         */
        tvSeries.addEpisode(new Episode("Bingus", 1, 7, random.nextInt(20, 31)));


        /*
        Oppgave 2.4
        Get episodes in season
         */
        System.out.println("\n---Episodes in season---");
        ArrayList<Episode> hannibalS2Episodes = hannibal.getEpisodesInSeason(2);
        for (Episode episode : hannibalS2Episodes) {
            /*
            Oppgave 2.6 - print the runtime
             */
            System.out.println(episode.getTitle() + ". Runtime: " + episode.getRuntimeInMinutes());
        }

        System.out.println();
        ArrayList<Episode> genericTVSeriesS4 = tvSeries.getEpisodesInSeason(4);
        for (Episode episode : genericTVSeriesS4) {
            /*
            Oppgave 2.6 - print the runtime
             */
            System.out.println(episode.getTitle() + ". Runtime: " + episode.getRuntimeInMinutes());
        }


        /*
        Oppgave 2.5
         */
        System.out.println("\n---Average run time---");
        System.out.println(tvSeries.getAverageRuntime());
    }
}
