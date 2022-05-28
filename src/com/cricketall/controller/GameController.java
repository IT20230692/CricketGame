package com.cricketall.controller;

import com.cricketall.models.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract public class GameController {

    private final static int No_OF_Code=2;
    private final static int NO_OF_PLAYERS=6;

    abstract protected int bat(Team battingTeam, int targetScore, Scanner scanner);

    public void playGame(){
        try(Scanner scanner = new Scanner(System.in)) {
            List<Team> teams = new ArrayList<>();
            createTeams(teams, scanner);

        }catch (Exception e){
            System.out.println("Game abrupty finished due to and error");
        }
    }

    private void createTeams(List<Team> teams, Scanner scanner) {
        for (int i = 0; i < No_OF_Code; i++){
            System.out.println("Enter Team " + (i+1) + "name : ");
            String input = scanner.nextLine();
            while (input == null || input.isEmpty()){
                System.out.println("Please Enter The Valid Name ");
                input = scanner.nextLine();
            }
            Team team = new Team(input, NO_OF_PLAYERS);
            teams.add(team);

        }
    }
}
