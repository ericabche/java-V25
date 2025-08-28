package no.hiof.prog2.oblig;

import no.hiof.prog2.oblig.model.TVSeries;
import no.hiof.prog2.oblig.repository.TVSeriesCSVRepository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class CSVMain {
    public static void main(String[] args) {
        // Oppgave 2.3 a)
        TVSeriesCSVRepository csvRepository = new TVSeriesCSVRepository(new File("tvseries.csv"));

        // Oppgave 2.3 b)
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();
        tvSeriesList.add(new TVSeries("Breaking Bad", "A high school teacher turns into a drug kingpin", LocalDate.of(2008, 1, 20)));
        tvSeriesList.add(new TVSeries("Game of Thrones", "Fantasy series about noble houses fighting for the Iron Throne", LocalDate.of(2011, 4, 17)));
        tvSeriesList.add(new TVSeries("Stranger Things", "Kids discover supernatural events in their small town", LocalDate.of(2016, 7, 15)));

        csvRepository.addListOfTVSeries(tvSeriesList); // Lagrer til CSV-fil

        // Oppgave 2.3 c)
        System.out.println("\n------------- Oppgave 2.3 c -------------");
        System.out.println("\n--- Alle TV-serier fra CSV ---");
        ArrayList<TVSeries> loadedSeries = csvRepository.getAllTVSeries();
        for (TVSeries series : loadedSeries) {
            System.out.println(series + "\n");
        }

        // Oppgave 2.3 d)
        System.out.println("\n------------- Oppgave 2.3 d -------------");
        System.out.println("\n--- Søk etter 'Breaking Bad' ---");
        TVSeries foundSeries = csvRepository.getTVSeriesByTitle("Breaking Bad");
        if (foundSeries != null) {
            System.out.println(foundSeries);
        } else {
            System.out.println("TV-serien ble ikke funnet.");
        }
    }
}