# Java OOP Assignment – Soccer League System

## Description
This project implements an object-oriented Java solution to model a soccer league system.
It tracks teams, players, matches, and goals, and generates a league standings table along
with detailed match reports.

## Classes

### 1. Player
Represents an individual player with a name and jersey number.

### 2. Team
Represents a team, containing a list of `Player` objects, along with total goals scored
and league points.

### 3. Goal
Represents a single goal event: the match it occurred in, the player who scored, and the
minute it was scored.

### 4. Match
Represents a single game between two teams (home and away), tracking the score and a list
of `Goal` objects.

### 5. Schedule
Manages the entire league: holds all teams and matches, updates team statistics (goals and
points), ranks teams by performance, and displays the standings table and match details.

## Class Relationships (Composition)
- `Team` contains a list of `Player`
- `Match` contains two `Team` objects (home and away) and a list of `Goal`
- `Goal` contains a reference to the `Player` who scored
- `Schedule` contains a list of `Team` and a list of `Match`

## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure the Project SDK is set to Java 21.
3. Run `Main.java` — it creates sample teams (Arsenal, Chelsea), plays two matches, and
   prints the league table and match details to the console.

## Sample Output