package ro.ctrln.clases;

import java.util.Objects;

public class SmallPlanet{
    private String planetName;

    public SmallPlanet(String planetName) {
        this.planetName = planetName;
    }

    public SmallPlanet () {
    }

    public String getPlanetName() {
        return this.planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String computeSmallPlanetLocation(Star star, int location) {
        return star.getStarDescription() + this.planetName + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallPlanet that = (SmallPlanet) o;
        return planetName.equals(that.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName);
    }

    @Override
    public String toString() {
        return "SmallPlanet{" +
                "planetName='" + planetName + '\'' +
                '}';
    }
}
