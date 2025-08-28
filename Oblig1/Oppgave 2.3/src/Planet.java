// Oppgave 2.3 a)
public class Planet {

    private String planetName;
    private double radius;
    private double mass;

    public Planet(){

    }

    //---- Konstruktør ----
    public Planet(String planetName, double radius, double mass) {
        this.planetName = planetName;
        this.radius = radius;
        this.mass = mass;
    }

    //---- Planet Navn ----
    public String getPlanetName() {
        return planetName;
    }
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    //---- Radius ----
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    //---- Masse ----
    public double getMass() {
        return mass;
    }
    public void setMass(double mass){
        this.mass = mass;
    }
}