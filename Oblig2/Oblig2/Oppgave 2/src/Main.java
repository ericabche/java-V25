import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        TVSeries prisonBreak = new TVSeries("Prison Break",
                "Structural engineer Michael Scofield gets himself imprisoned to help his brother escape.",
                LocalDate.of(2005, 8, 29));

        Random random = new Random();


        for (int season = 1; season <= 5; season++) {
            for (int episodeNum = 1; episodeNum <= 10; episodeNum++) {
                int runtime = random.nextInt(11) + 20; // 20-30 minutter
                prisonBreak.addEpisode(new Episode("Episode " + episodeNum, episodeNum, season, runtime));
            }
        }
        System.out.println(prisonBreak);


        System.out.println("Episodes in Season 1:");
        for (Episode ep : prisonBreak.getEpisodesInSeason(1)) {
            System.out.println(ep.getTitle());
        }


        System.out.printf("\nAverage runtime: %.2f minutes%n", prisonBreak.getAverageRunTime());


        System.out.println("\nOppgave 2.8 - Feilmelding:");
        prisonBreak.addEpisode(new Episode("Invalid Episode", 1, 7, 25));


        System.out.println("\nNumber of seasons: " + prisonBreak.getNumSeasons());
    }
}