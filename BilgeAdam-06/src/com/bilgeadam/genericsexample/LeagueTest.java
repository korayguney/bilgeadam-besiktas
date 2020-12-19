package com.bilgeadam.genericsexample;

import java.util.ArrayList;

public class LeagueTest {
    public static void main(String[] args) {

        League<Team<FootballPlayer>> superLig = new League<>("Turkiye Super Ligi");

        Team<FootballPlayer> fenerbahce = new Team<>("Fenerbahçe");
        Team<FootballPlayer> galatasaray = new Team<>("Galatasaray");
        Team<FootballPlayer> besiktas = new Team<>("Beşiktaş");
        Team<FootballPlayer> trabzonspor = new Team<>("Trabzonspor");
        Team<VolleyBallPlayer> trabzonsporVT = new Team<>("TrabzonsporVT");

        galatasaray.matchScore(fenerbahce, 0, 6);
        galatasaray.matchScore(trabzonspor, 2, 1);
        besiktas.matchScore(fenerbahce, 4, 3);
        besiktas.matchScore(galatasaray, 2, 0);
        trabzonspor.matchScore(fenerbahce, 0, 3);
        trabzonspor.matchScore(besiktas, 2, 2);

        superLig.addTeam(galatasaray);
        superLig.addTeam(fenerbahce);
        superLig.addTeam(besiktas);
        superLig.addTeam(trabzonspor);
        //superLig.addTeam(trabzonsporVT);

        System.out.println("====== RANKING =====");
        superLig.showLeagueTable();




    }
}
