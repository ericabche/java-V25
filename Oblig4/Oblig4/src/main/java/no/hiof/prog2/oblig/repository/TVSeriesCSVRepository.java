package no.hiof.prog2.oblig.repository;

import no.hiof.prog2.oblig.model.TVSeries;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TVSeriesCSVRepository implements TVSeriesRepository {
    private File file;

    // Oppgave 2.3 a)
    public TVSeriesCSVRepository(File file) {
        this.file = file;
    }

    // Oppgave 2.3 b)
    @Override
    public void addListOfTVSeries(ArrayList<TVSeries> listOfTVSeries) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, false))) {
            for (TVSeries tvSeries : listOfTVSeries) {
                writer.println(tvSeries.getTitle() + ";" + tvSeries.getDescription() + ";" +
                        tvSeries.getReleaseDate().getYear() + ";" +
                        tvSeries.getReleaseDate().getMonthValue() + ";" +
                        tvSeries.getReleaseDate().getDayOfMonth());
            }
            System.out.println("TV-serier lagret til CSV!");
        } catch (IOException e) {
            System.err.println("Feil ved skriving til CSV: " + e.getMessage());
        }
    }

    // Oppgave 2.3 c)
    @Override
    public ArrayList<TVSeries> getAllTVSeries() {
        ArrayList<TVSeries> tvSeriesList = new ArrayList<>();

        if (!file.exists()) return tvSeriesList;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 5) {
                    String title = data[0];
                    String description = data[1];
                    int year = Integer.parseInt(data[2]);
                    int month = Integer.parseInt(data[3]);
                    int day = Integer.parseInt(data[4]);

                    LocalDate releaseDate = LocalDate.of(year, month, day);
                    tvSeriesList.add(new TVSeries(title, description, releaseDate));
                }
            }
        } catch (IOException e) {
            System.err.println("Feil ved lesing fra CSV: " + e.getMessage());
        }

        return tvSeriesList;
    }

    // Oppgave 2.3 d)
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