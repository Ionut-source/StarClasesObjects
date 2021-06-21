package ro.ctrln.clases;

import java.util.Objects;

public class Planet {

    private String planetName;
    private int numberOfOceans;
    private double mass;
    private short numbersOfMoons;

    public Planet(){ }

    public Planet(String planetName, int numberOfOceans, double mass, short numbersOfMoons){
        super(); //refera clasa parinte
        this.planetName = planetName;
        this.numberOfOceans = numberOfOceans;
        this.mass = mass;
        this.numbersOfMoons = numbersOfMoons;
    }

    public String getPlanetName(){
        return this.planetName;
    }

    public int getNumberOfOceans(){
        return this.numberOfOceans;
    }

    public double getMass(){
        return this.mass;
    }

    public short getNumbersOfMoons(){
        return this.numbersOfMoons;
    }

    public void setPlanetName(String planetName){
        this.planetName = planetName;
    }

    public void setNumberOfOceans(int numberOfOceans) {
        this.numberOfOceans = numberOfOceans;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setNumbersOfMoons(short numbersOfMoons){
        this.numbersOfMoons = numbersOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetName='" + planetName + '\'' +
                ", numberOfOceans=" + numberOfOceans +
                ", mass=" + mass +
                ", numbersOfMoons=" + numbersOfMoons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return numberOfOceans == planet.numberOfOceans && Double.compare(planet.mass, mass) == 0 && numbersOfMoons == planet.numbersOfMoons && planetName.equals(planet.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName, numberOfOceans, mass, numbersOfMoons);
    }

        public double computeMass(int powerOfTen) {
            return this.mass * Math.pow(10, powerOfTen);
    }
}
