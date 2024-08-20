package dev.razafindratelo;

import dev.razafindratelo.destinations.Points;
import dev.razafindratelo.walks.RandomWalks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Points HEI = new Points("HEI", 0);
        Points Pullman = new Points("Pullman", 1);
        Points Balancoir = new Points("Balançoire", 2);
        Points Nexta = new Points("Nexta", 3);
        Points Esti =  new Points("Esti", 4);
        Points Boulevard = new Points("Boulevard", 5);
        Points Sekolintsika = new Points("Sekolintsika", 6);
        Points Marais = new Points("Marais", 7);

        List<Points> pointsList1 = List.of(Balancoir, Pullman, Sekolintsika);
        HEI.setPossibleDestinations(pointsList1);

        List<Points> pointsList2 = List.of(HEI, Nexta, Balancoir);
        Pullman.setPossibleDestinations(pointsList2);

        List<Points> pointsList3 = List.of(HEI, Pullman, Boulevard, Esti);
        Balancoir.setPossibleDestinations(pointsList3);

        List<Points> pointsList4 = List.of(Pullman);
        Nexta.setPossibleDestinations(pointsList4);

        List<Points> pointsList5 = List.of(Boulevard, Balancoir);
        Esti.setPossibleDestinations(pointsList5);

        List<Points> pointsList6 = List.of(Balancoir, Esti);
        Boulevard.setPossibleDestinations(pointsList6);

        List<Points> pointsList7 = List.of(HEI, Marais);
        Sekolintsika.setPossibleDestinations(pointsList7);

        List<Points> pointsList8 = List.of(Sekolintsika);
        Marais.setPossibleDestinations(pointsList8);

        var randomWalks = new RandomWalks(HEI, Esti);

        randomWalks.randomWalk();
        System.out.println(randomWalks.getPattern());

    }
}