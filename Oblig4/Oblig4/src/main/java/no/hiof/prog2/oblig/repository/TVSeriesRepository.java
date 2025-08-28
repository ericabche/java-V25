package no.hiof.prog2.oblig.repository;

import no.hiof.prog2.oblig.model.TVSeries;
import java.util.ArrayList;

// Oppgave 2.2
public interface TVSeriesRepository {
    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);
    ArrayList<TVSeries> getAllTVSeries();
    TVSeries getTVSeriesByTitle(String title);
}