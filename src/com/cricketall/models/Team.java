package com.cricketall.models;

import java.util.List;

public class Team {

    private String name;
    private List<Player> players; //get player clz members as a team
    private int totalScore;
    private int totalWickets;
    private int currentBatsman;
    private boolean hasWonToss;

    public Team(String name, int noOfPlayers) {
        this.name = name;
        this.totalScore = 0;
        this.totalWickets = 0;
        this.currentBatsman = -1;
        this.hasWonToss = false;
    }

    private void setPalyer(int noOfPlayers){
        for (int i = 0; i < noOfPlayers; i++){
            Player player = new Player(String.valueOf(i));
            players.add(player);
        }
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public boolean isHasWonToss() {
        return hasWonToss;
    }

    public void setHasWonToss(boolean hasWonToss) {
        this.hasWonToss = hasWonToss;
    }
}
