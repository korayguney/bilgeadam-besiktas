package com.bilgeadam.genericsexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestTeam {

    public static void main(String[] args) {
        FootballPlayer sarbi = new FootballPlayer("Sarbi Sarıoğlu");
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan");
        VolleyBallPlayer cansu = new VolleyBallPlayer("Cansu Özbay");

        Team<FootballPlayer> galatasaray = new Team<>("Galatasaray");

        galatasaray.addPlayer(sarbi);
        galatasaray.addPlayer(sarbi);
        //galatasaray.addPlayer(jordan);
        //galatasaray.addPlayer(cansu);


        Team<BasketballPlayer> anadoluEfes = new Team<>("Anadolu Efes");
        //anadoluEfes.addPlayer(sarbi);
        anadoluEfes.addPlayer(jordan);

        Team<FootballPlayer> fenerbahce = new Team<>("Fenerbahçe");
        Team<FootballPlayer> besiktas = new Team<>("Beşiktaş");
        Team<FootballPlayer> trabzonspor = new Team<>("Trabzonspor");

        galatasaray.matchScore(fenerbahce, 0, 6);
        galatasaray.matchScore(trabzonspor, 2, 1);
        besiktas.matchScore(fenerbahce, 4, 3);
        besiktas.matchScore(galatasaray, 2, 0);
        trabzonspor.matchScore(fenerbahce, 0, 3);
        trabzonspor.matchScore(besiktas, 2, 2);
        //trabzonspor.matchScore(anadoluEfes, 1,2);

        ArrayList<Team<FootballPlayer>> teams = new ArrayList<>();
        teams.add(galatasaray);
        teams.add(fenerbahce);
        teams.add(besiktas);
        teams.add(trabzonspor);
        //teams.add(anadoluEfes);

        Collections.sort(teams);

        System.out.println("====== RANKING =====");
        for (Team<FootballPlayer> team : teams) {
            System.out.println(team.getName() + ":" + team.ranking());
        }




    }
}
