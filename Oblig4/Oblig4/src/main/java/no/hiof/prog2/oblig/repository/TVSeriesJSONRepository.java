package no.hiof.prog2.oblig.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import no.hiof.prog2.oblig.model.TVSeries;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Oppgave 2.4 b)
public class TVSeriesJSONRepository implements TVSeriesRepository {
    private File file;
    private ObjectMapper objectMapper;


    public TVSeriesJSONRepository(File file) {
        this.file = file;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    // Oppgave 2.4 c)
    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try {
            objectMapper.writeValue(file, listOfTVSeries);
            System.out.println("TV-serier lagret til JSON!");
        } catch (IOException e) {
            System.err.println("Feil ved skriving til JSON: " + e.getMessage());
        }
    }

    // Oppgave 2.4 d)
    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        if (!file.exists()) return new ArrayList<>();

        try {
            return objectMapper.readValue(file, objectMapper.getTypeFactory()
                    .constructCollectionType(ArrayList.class, TVSeries.class));
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra JSON: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    // Oppgave 2.4 e)
    @Override
    public TVSeries getTVSeriesByTitle(String title) {
        List<TVSeries> allSeries = getAllTVSeries();

        for (TVSeries series : allSeries) {
            if (series.getTitle().equalsIgnoreCase(title)) {
                return series;
            }
        }
        return null;
    }
}