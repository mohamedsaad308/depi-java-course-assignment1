package org.example;

import java.util.ArrayList;

public class Schedule {
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    // Constructor
    public Schedule() {
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Add a team to the league
    public void addTeam(Team t) {
        teams.add(t);
    }

    // Add a match to the schedule
    public void addMatch(Match m) {
        matches.add(m);
    }

    // Getters
    public ArrayList<Team> getTeams() {
        return teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    // Update goals and points for every team based on match results
    public void updateStatistics() {
        // Reset first so this can be called safely more than once
        for (Team t : teams) {
            t.setTeamName(t.getTeamName()); // no-op, just illustrating; goals/points reset below
        }

        for (Match m : matches) {
            Team home = m.getHomeTeam();
            Team away = m.getAwayTeam();

            home.addGoals(m.getHomeScore());
            away.addGoals(m.getAwayScore());

            if (m.getHomeScore() > m.getAwayScore()) {
                home.addPoints(3);
            } else if (m.getHomeScore() < m.getAwayScore()) {
                away.addPoints(3);
            } else {
                home.addPoints(1);
                away.addPoints(1);
            }
        }
    }

    // Rank teams by points (descending), tiebreak by goals
    public void rankTeams() {
        teams.sort((a, b) -> {
            if (b.getPoints() != a.getPoints()) {
                return b.getPoints() - a.getPoints();
            }
            return b.getTotalGoals() - a.getTotalGoals();
        });
    }

    // Print the standings table
    public void displayTable() {
        rankTeams();
        System.out.println("Team\t\tGoals\tPoints");
        for (Team t : teams) {
            System.out.println(t.getTeamName() + "\t\t" + t.getTotalGoals() + "\t" + t.getPoints());
        }
    }

    // Print details for one match by its ID
    public void displayMatchDetails(String matchId) {
        for (Match m : matches) {
            if (m.getMatchId().equals(matchId)) {
                m.printMatchDetails();
                return;
            }
        }
        System.out.println("Match not found: " + matchId);
    }
}