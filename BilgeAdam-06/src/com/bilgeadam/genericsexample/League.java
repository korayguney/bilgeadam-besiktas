package com.bilgeadam.genericsexample;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String league_name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String league_name) {
        this.league_name = league_name;
    }

    public void addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already exist");
        }
        System.out.println(team.getName() + " is added to the " + this.getLeague_name());
        teams.add(team);
    }

    public void showLeagueTable(){
        Collections.sort(teams);
        for (T team : teams) {
            System.out.println(team.getName() + ":" + team.ranking());
        }
    }

    public String getLeague_name() {
        return league_name;
    }

    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<T> teams) {
        this.teams = teams;
    }
}
