package no.hiof.oleedvao.oblig4.repository;

import io.javalin.http.Context;
import no.hiof.oleedvao.oblig4.model.TVSeries;

import java.util.List;
import java.util.Optional;

// Oppgave 2.7a
public class TVSeriesController {
    private final TVSeriesRepository repository;

    public TVSeriesController(TVSeriesRepository repository) {
        this.repository = repository;
    }

    // Oppgave 2.4a
    public void getAllTVSeries(Context ctx) {
        List<TVSeries> tvSeriesList = repository.getAllTVSeries();
        ctx.json(tvSeriesList);
    }

    // Oppgave 2.5a
    public void getTVSeriesByTitle(Context ctx) {
        String title = ctx.pathParam("tvseries-name");
        Optional<TVSeries> tvSeries = repository.getTVSeriesByTitle(title);

        if (tvSeries.isPresent()) {
            ctx.json(tvSeries.get());
        } else {
            ctx.status(404).result("TV-serien ble ikke funnet.");
        }
    }

    // Oppgave 2.6b
    public void addTVSeries(Context ctx) {
        String title = ctx.formParam("title");
        String description = ctx.formParam("description");
        int year = Integer.parseInt(ctx.formParam("release-date-year"));
        int month = Integer.parseInt(ctx.formParam("release-date-month"));
        int day = Integer.parseInt(ctx.formParam("release-date-day"));

        TVSeries newSeries = new TVSeries(title, description, year, month, day);
        repository.addTVSeries(newSeries);

        ctx.redirect("/tvseries/" + title);
    }
}