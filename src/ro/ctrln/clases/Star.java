package ro.ctrln.clases;


import java.math.BigDecimal;
import java.util.Objects;

public class Star {

    private String StarDescription; //variabila de instanta
    private int diameter; //variabila de instanta
    private int satelites; //variabila de instanta
    private BigDecimal mass; //variabila de instanta
    private SmallPlanet smallPlanet; //variabila de instanta

    public static final boolean MILKYWAYSTAR = true; //variablila de clasa

    public Star() {
    }

    public Star(String starDescription, int diameter, int satelites, BigDecimal mass) {
        StarDescription = starDescription;
        this.diameter = diameter;
        this.satelites = satelites;
        this.mass = mass;
    }

    public String getStarDescription() {
        return StarDescription;
    }

    public void setStarDescription(String starDescription) {
        StarDescription = starDescription;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getSatelites(int i) {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public void setSmallPlanet (SmallPlanet smallPlanet)/*parametrul metodei*/ {
        this.smallPlanet /*variabila de instanta*/ = smallPlanet; //parametrul metodei
    }

    public SmallPlanet getSmallPlanet() {
        return this.smallPlanet; //variabila de instanta
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return this.diameter == star.diameter &&
                this.satelites == star.satelites &&
                this.StarDescription.equals(star.StarDescription) &&
                this.mass.equals(star.mass) &&
                this.smallPlanet.equals(star.smallPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StarDescription, diameter, satelites, mass, smallPlanet);
    }

    @Override
    public String toString() {
        return "Star{" +
                "StarDescription='" + StarDescription + '\'' +
                ", diameter=" + diameter +
                ", satelites=" + satelites +
                ", mass=" + mass +
                ", smallPlanet=" + smallPlanet +
                '}';
    }
}


