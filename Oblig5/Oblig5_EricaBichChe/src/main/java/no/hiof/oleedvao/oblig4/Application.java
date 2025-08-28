package no.hiof.oleedvao.oblig4;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.vue.VueComponent;
import no.hiof.oleedvao.oblig4.repository.TVSeriesController;
import no.hiof.oleedvao.oblig4.repository.TVSeriesDataRepository;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.staticFiles.add("/vue", Location.CLASSPATH);
            config.vue.vueInstanceNameInJs = "app";
        }).start(8080);

        TVSeriesController controller = new TVSeriesController(new TVSeriesDataRepository());

        app.get("/", new VueComponent("home-page"));
        app.get("/tvseries", new VueComponent("tvseries-overview"));
        app.get("/tvseries/{tvseries-name}", new VueComponent("tvseries-detail"));
        app.get("/add-tvseries", new VueComponent("add-tvseries"));

        app.get("/api/tvseries", controller::getAllTVSeries); // Oppgave 2.4a
        app.get("/api/tvseries/{tvseries-name}", controller::getTVSeriesByTitle); // Oppgave 2.5a
        app.post("/api/add-tvseries", controller::addTVSeries); // Oppgave 2.6b

        System.out.println("Server running at http://localhost:8080/");
    }
}