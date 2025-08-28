// Oppgave 2.3 b)
public class Oppgave2_3 {
    public static void main(String[] args) {

    Planet merkur = new Planet ("Merkur", 2439.7, 3.30E23);
        System.out.println("---- Merkur ----");
        System.out.println("Planeten " + merkur.getPlanetName() + " har en radius på " + merkur.getRadius() +
                " km og en masse på " + merkur.getMass() + (" kg."));


    Planet venus = new Planet ("Venus", 6051.8, 4.87E24);
        System.out.println("\n---- Venus ----");
        System.out.println("Planeten " + venus.getPlanetName() + " har en radius på " + venus.getRadius() +
                " km og en masse på " + venus.getMass() + (" kg."));


    Planet earth = new Planet ("Earth", 6371.0, 5.97E24);
        System.out.println("\n---- Earth ----");
        System.out.println("Planeten " + earth.getPlanetName() + " har en radius på " + earth.getRadius() +
                " km og en masse på " + earth.getMass() + (" kg."));


    Planet mars = new Planet ("Mars", 3389.5, 6.39E23);
        System.out.println("\n---- Mars ----");
        System.out.println("Planeten " + mars.getPlanetName() + " har en radius på " + mars.getRadius() +
                " km og en masse på " + mars.getMass() + (" kg."));


    Planet jupiter = new Planet ("Jupiter", 69911, 1.90E27);
        System.out.println("\n---- Jupiter ----");
        System.out.println("Planeten " + jupiter.getPlanetName() + " har en radius på " + jupiter.getRadius() +
                " km og en masse på " + jupiter.getMass() + (" kg."));


    Planet saturn = new Planet ("Saturn", 58232, 5.68E26);
        System.out.println("\n---- Saturn ----");
        System.out.println("Planeten " + saturn.getPlanetName() + " har en radius på " + saturn.getRadius() +
                " km og en masse på " + saturn.getMass() + (" kg."));


    Planet uranus = new Planet ("Uranus", 25362, 8.68E25);
        System.out.println("\n---- Uranus ----");
        System.out.println("Planeten " + uranus.getPlanetName() + " har en radius på " + uranus.getRadius() +
                " km og en masse på " + uranus.getMass() + (" kg."));


    Planet neptun = new Planet ("Neptun", 24622, 1.02E26);
        System.out.println("\n---- Neptun ----");
        System.out.println("Planeten " + neptun.getPlanetName() + " har en radius på " + neptun.getRadius() +
                " km og en masse på " + neptun.getMass() + (" kg."));
    }
}
