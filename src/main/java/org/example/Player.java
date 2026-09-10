package org.example;

public class Player {
    private String name;
    private int jerseyNumber;

    // Constructor
    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return name + " (#" + jerseyNumber + ")";
    }
}