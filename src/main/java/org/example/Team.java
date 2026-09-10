package org.example;
import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private int totalGoals;
    private int points;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.totalGoals = 0;
        this.points = 0;
    }

    // Add a player to this team
    public void addPlayer(Player p) {
        players.add(p);
    }

    // Getters
    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getPoints() {
        return points;
    }

    // Setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Add goals/points (used later by Schedule)
    public void addGoals(int goals) {
        this.totalGoals += goals;
    }

    public void addPoints(int pts) {
        this.points += pts;
    }

    @Override
    public String toString() {
        return teamName + " | Goals: " + totalGoals + " | Points: " + points;
    }
}