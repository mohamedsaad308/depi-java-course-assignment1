package org.example;

import java.util.ArrayList;

public class Match {
    private String matchId;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;
    private ArrayList<Goal> goals;

    // Constructor
    public Match(String matchId, Team homeTeam, Team awayTeam) {
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.goals = new ArrayList<>();
    }

    // Add a goal and update the correct team's score
    public void addGoal(Goal g) {
        goals.add(g);

        // Figure out which team the scorer belongs to
        if (homeTeam.getPlayers().contains(g.getScorer())) {
            homeScore++;
        } else if (awayTeam.getPlayers().contains(g.getScorer())) {
            awayScore++;
        }
    }

    // Getters
    public String getMatchId() {
        return matchId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    // Result summary
    public String getResult() {
        return homeTeam.getTeamName() + " " + homeScore + " - " + awayScore + " " + awayTeam.getTeamName();
    }

    // Detailed goal-by-goal breakdown
    public void printMatchDetails() {
        System.out.println("Match: " + getResult());
        for (Goal g : goals) {
            System.out.println("  " + g);
        }
    }
}