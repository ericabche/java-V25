package no.hiof.oleedvao.oblig4.repository;

import no.hiof.oleedvao.oblig4.model.TVSeries;

import java.util.ArrayList;
import java.util.Optional;

public interface TVSeriesRepository {

    ArrayList<TVSeries> getAllTVSeries();

    TVSeries getTVSeries(String title);

    void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries);

    Optional<TVSeries> getTVSeriesByTitle(String title);

    void addTVSeries(TVSeries newSeries);
}