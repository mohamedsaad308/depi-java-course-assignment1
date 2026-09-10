package org.example;

public class Main {
    public static void main(String[] args) {
        // Create teams
        Team arsenal = new Team("Arsenal");
        Team chelsea = new Team("Chelsea");

        // Arsenal players
        Player saka = new Player("Bukayo Saka", 7);
        Player odegaard = new Player("Martin Odegaard", 8);
        Player havertz = new Player("Kai Havertz", 29);
        arsenal.addPlayer(saka);
        arsenal.addPlayer(odegaard);
        arsenal.addPlayer(havertz);

        // Chelsea players
        Player palmer = new Player("Cole Palmer", 20);
        Player jackson = new Player("Nicolas Jackson", 15);
        chelsea.addPlayer(palmer);
        chelsea.addPlayer(jackson);

        // Create a match: Arsenal (home) vs Chelsea (away)
        Match match1 = new Match("M1", arsenal, chelsea);

        // Add goals
        Goal goal1 = new Goal("M1", saka, 12);
        Goal goal2 = new Goal("M1", havertz, 45);
        Goal goal3 = new Goal("M1", palmer, 67);

        match1.addGoal(goal1);
        match1.addGoal(goal2);
        match1.addGoal(goal3);

        // Second match: Chelsea (home) vs Arsenal (away)
        Match match2 = new Match("M2", chelsea, arsenal);
        Goal goal4 = new Goal("M2", jackson, 30);
        Goal goal5 = new Goal("M2", odegaard, 55);
        Goal goal6 = new Goal("M2", odegaard, 78);

        match2.addGoal(goal4);
        match2.addGoal(goal5);
        match2.addGoal(goal6);

        // Set up the schedule
        Schedule schedule = new Schedule();
        schedule.addTeam(arsenal);
        schedule.addTeam(chelsea);
        schedule.addMatch(match1);
        schedule.addMatch(match2);

        // Update stats and show results
        schedule.updateStatistics();

        System.out.println("=== League Table ===");
        schedule.displayTable();

        System.out.println("\n=== Match Details ===");
        schedule.displayMatchDetails("M1");
        schedule.displayMatchDetails("M2");
    }
}