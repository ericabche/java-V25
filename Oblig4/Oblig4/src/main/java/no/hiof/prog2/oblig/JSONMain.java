package no.hiof.prog2.oblig;

import no.hiof.prog2.oblig.model.TVSeries;
import no.hiof.prog2.oblig.repository.TVSeriesJSONRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class JSONMain {
    public static void main(String[] args) {
        // Oppgave 2.4 b)
        TVSeriesJSONRepository jsonRepository = new TVSeriesJSONRepository(new File("tvseries.json"));

        // Oppgave 2.4 c)
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(new TVSeries("Breaking Bad", "A high school teacher turns into a drug kingpin", LocalDate.of(2008, 1, 20)));
        tvSeriesList.add(new TVSeries("Game of Thrones", "Fantasy series about noble houses fighting for the Iron Throne", LocalDate.of(2011, 4, 17)));
        tvSeriesList.add(new TVSeries("Stranger Things", "Kids discover supernatural events in their small town", LocalDate.of(2016, 7, 15)));

        jsonRepository.addListOfTVSeries(tvSeriesList); // Lagrer til JSON-fil

        // Oppgave 2.4 d)
        System.out.println("\n------------- Oppgave 2.4 d -------------");
        System.out.println("\n--- Alle TV-serier fra JSON ---");
        ArrayList<TVSeries> loadedSeries = jsonRepository.getAllTVSeries();
        for (TVSeries series : loadedSeries) {
            System.out.println(series);
        }

        // Oppgave 2.4 e)
        System.out.println("\n------------- Oppgave 2.4 e -------------");

        System.out.println("\n--- Søk etter 'Breaking Bad' ---");
        TVSeries foundSeries = jsonRepository.getTVSeriesByTitle("Breaking Bad");
        if (foundSeries != null) {
            System.out.println(foundSeries);
        } else {
            System.out.println("TV-serien ble ikke funnet.");
        }
    }
}