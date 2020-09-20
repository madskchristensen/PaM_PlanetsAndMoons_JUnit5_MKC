package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Orbital {
    private String name;
    private double lengthOfYear;
    private Orbital circulating;

    public Orbital() {

    }

    public Orbital(String name, double lengthOfYear, Orbital circulating) {
        this.name = name;
        this.lengthOfYear = lengthOfYear;
        this.circulating = circulating;
    }

    public Orbital getCirculating() {
        return circulating;
    }

    public void setCirculating(Orbital circulating) {
        this.circulating = circulating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthOfYear() {
        return lengthOfYear;
    }

    public void setLengthOfYear(double lengthOfYear) {
        this.lengthOfYear = lengthOfYear;
    }
}
