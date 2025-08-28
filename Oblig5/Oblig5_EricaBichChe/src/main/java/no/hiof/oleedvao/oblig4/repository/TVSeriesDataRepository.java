package no.hiof.oleedvao.oblig4.repository;

import no.hiof.oleedvao.oblig4.model.Episode;
import no.hiof.oleedvao.oblig4.model.TVSeries;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Oppgave 2.2
public class TVSeriesDataRepository implements TVSeriesRepository {
    private List<TVSeries> allTvSeries;

    public TVSeriesDataRepository() {
        allTvSeries = new ArrayList<>();

        TVSeries breakingBad = new TVSeries("Breaking Bad", "En kjemilærer blir narkobaron.", 2008, 1, 20);
        breakingBad.addEpisode(new Episode("Pilot", 1, 1));
        breakingBad.addEpisode(new Episode("Cat's in the Bag", 1, 2));

        allTvSeries.add(breakingBad);
    }

    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        return (ArrayList<TVSeries>) allTvSeries;
    }

    @Override
    public TVSeries getTVSeries(String title) {
        return null;
    }

    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {

    }

    @Override
    public Optional<TVSeries> getTVSeriesByTitle(String title) {
        return allTvSeries.stream()
                .filter(tvSeries -> tvSeries.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    @Override
    public void addTVSeries(TVSeries tvSeries) {
        allTvSeries.add(tvSeries);
    }
}