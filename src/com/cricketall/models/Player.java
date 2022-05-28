package com.cricketall.models;

public class Player {

    private String name;
    private int score;
    private String goOutBy;
    private String wicketType;
    private String status;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.goOutBy = "";
        this.wicketType = "";
        this.status = "Not_Yet_Bat";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGoOutBy() {
        return goOutBy;
    }

    public void setGoOutBy(String goOutBy) {
        this.goOutBy = goOutBy;
    }

    public String getWicketType() {
        return wicketType;
    }

    public void setWicketType(String wicketType) {
        this.wicketType = wicketType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
