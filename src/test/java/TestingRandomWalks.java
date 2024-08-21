import dev.razafindratelo.destinations.Points;
import dev.razafindratelo.walks.RandomWalks;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingRandomWalks {

    @Test
    void testRandomWalks_HEI_to_ESTI() {
        Points HEI = new Points("HEI", 0);
        Points PULLMAN = new Points("PULLMAN", 1);
        Points BALANCOIR = new Points("Balançoire", 2);
        Points NEXTA = new Points("NEXTA", 3);
        Points ESTI =  new Points("ESTI", 4);
        Points BOULEVARD = new Points("BOULEVARD", 5);
        Points SEKOLINTSIKA = new Points("SEKOLINTSIKA", 6);
        Points MARAIS = new Points("MARAIS", 7);
        List<Points> pointsList1 = List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA);
        HEI.setPossibleDestinations(pointsList1);
        List<Points> pointsList2 = List.of(HEI, NEXTA, BALANCOIR);
        PULLMAN.setPossibleDestinations(pointsList2);
        List<Points> pointsList3 = List.of(HEI, PULLMAN, BOULEVARD, ESTI);
        BALANCOIR.setPossibleDestinations(pointsList3);
        List<Points> pointsList4 = List.of(PULLMAN);
        NEXTA.setPossibleDestinations(pointsList4);
        List<Points> pointsList5 = List.of(BOULEVARD, BALANCOIR);
        ESTI.setPossibleDestinations(pointsList5);
        List<Points> pointsList6 = List.of(BALANCOIR, ESTI);
        BOULEVARD.setPossibleDestinations(pointsList6);
        List<Points> pointsList7 = List.of(HEI, MARAIS);
        SEKOLINTSIKA.setPossibleDestinations(pointsList7);
        List<Points> pointsList8 = List.of(SEKOLINTSIKA);
        MARAIS.setPossibleDestinations(pointsList8);

        var randomWalks = new RandomWalks(HEI, ESTI);

        randomWalks.randomWalk();
        List<Points> paths = randomWalks.getPattern();

        assertEquals("HEI", paths.getFirst().getName());
        assertEquals("ESTI", paths.getLast().getName());

    }

    @Test
    void testRandomWalks_MARAIS_to_Boulevard() {
        Points HEI = new Points("HEI", 0);
        Points PULLMAN = new Points("PULLMAN", 1);
        Points BALANCOIR = new Points("Balançoire", 2);
        Points NEXTA = new Points("NEXTA", 3);
        Points ESTI =  new Points("ESTI", 4);
        Points BOULEVARD = new Points("BOULEVARD", 5);
        Points SEKOLINTSIKA = new Points("SEKOLINTSIKA", 6);
        Points MARAIS = new Points("MARAIS", 7);
        List<Points> pointsList1 = List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA);
        HEI.setPossibleDestinations(pointsList1);
        List<Points> pointsList2 = List.of(HEI, NEXTA, BALANCOIR);
        PULLMAN.setPossibleDestinations(pointsList2);
        List<Points> pointsList3 = List.of(HEI, PULLMAN, BOULEVARD, ESTI);
        BALANCOIR.setPossibleDestinations(pointsList3);
        List<Points> pointsList4 = List.of(PULLMAN);
        NEXTA.setPossibleDestinations(pointsList4);
        List<Points> pointsList5 = List.of(BOULEVARD, BALANCOIR);
        ESTI.setPossibleDestinations(pointsList5);
        List<Points> pointsList6 = List.of(BALANCOIR, ESTI);
        BOULEVARD.setPossibleDestinations(pointsList6);
        List<Points> pointsList7 = List.of(HEI, MARAIS);
        SEKOLINTSIKA.setPossibleDestinations(pointsList7);
        List<Points> pointsList8 = List.of(SEKOLINTSIKA);
        MARAIS.setPossibleDestinations(pointsList8);

        var randomWalks = new RandomWalks(MARAIS, BOULEVARD);

        randomWalks.randomWalk();
        List<Points> paths = randomWalks.getPattern();

        assertEquals("MARAIS", paths.getFirst().getName());
        assertEquals("BOULEVARD", paths.getLast().getName());
    }

    @Test
    void testRandomWalks_SEKOLINTSIKA_to_HEI() {
        Points HEI = new Points("HEI", 0);
        Points PULLMAN = new Points("PULLMAN", 1);
        Points BALANCOIR = new Points("Balançoire", 2);
        Points NEXTA = new Points("NEXTA", 3);
        Points ESTI =  new Points("ESTI", 4);
        Points BOULEVARD = new Points("BOULEVARD", 5);
        Points SEKOLINTSIKA = new Points("SEKOLINTSIKA", 6);
        Points MARAIS = new Points("MARAIS", 7);
        List<Points> pointsList1 = List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA);
        HEI.setPossibleDestinations(pointsList1);
        List<Points> pointsList2 = List.of(HEI, NEXTA, BALANCOIR);
        PULLMAN.setPossibleDestinations(pointsList2);
        List<Points> pointsList3 = List.of(HEI, PULLMAN, BOULEVARD, ESTI);
        BALANCOIR.setPossibleDestinations(pointsList3);
        List<Points> pointsList4 = List.of(PULLMAN);
        NEXTA.setPossibleDestinations(pointsList4);
        List<Points> pointsList5 = List.of(BOULEVARD, BALANCOIR);
        ESTI.setPossibleDestinations(pointsList5);
        List<Points> pointsList6 = List.of(BALANCOIR, ESTI);
        BOULEVARD.setPossibleDestinations(pointsList6);
        List<Points> pointsList7 = List.of(HEI, MARAIS);
        SEKOLINTSIKA.setPossibleDestinations(pointsList7);
        List<Points> pointsList8 = List.of(SEKOLINTSIKA);
        MARAIS.setPossibleDestinations(pointsList8);

        var randomWalks = new RandomWalks(SEKOLINTSIKA, HEI);

        randomWalks.randomWalk();
        List<Points> paths = randomWalks.getPattern();

        assertEquals("SEKOLINTSIKA", paths.getFirst().getName());
        assertEquals("HEI", paths.getLast().getName());
    }

    @Test
    void testRandomWalks_ESTI_to_MARAIS() {
        Points HEI = new Points("HEI", 0);
        Points PULLMAN = new Points("PULLMAN", 1);
        Points BALANCOIR = new Points("Balançoire", 2);
        Points NEXTA = new Points("NEXTA", 3);
        Points ESTI =  new Points("ESTI", 4);
        Points BOULEVARD = new Points("BOULEVARD", 5);
        Points SEKOLINTSIKA = new Points("SEKOLINTSIKA", 6);
        Points MARAIS = new Points("MARAIS", 7);
        List<Points> pointsList1 = List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA);
        HEI.setPossibleDestinations(pointsList1);
        List<Points> pointsList2 = List.of(HEI, NEXTA, BALANCOIR);
        PULLMAN.setPossibleDestinations(pointsList2);
        List<Points> pointsList3 = List.of(HEI, PULLMAN, BOULEVARD, ESTI);
        BALANCOIR.setPossibleDestinations(pointsList3);
        List<Points> pointsList4 = List.of(PULLMAN);
        NEXTA.setPossibleDestinations(pointsList4);
        List<Points> pointsList5 = List.of(BOULEVARD, BALANCOIR);
        ESTI.setPossibleDestinations(pointsList5);
        List<Points> pointsList6 = List.of(BALANCOIR, ESTI);
        BOULEVARD.setPossibleDestinations(pointsList6);
        List<Points> pointsList7 = List.of(HEI, MARAIS);
        SEKOLINTSIKA.setPossibleDestinations(pointsList7);
        List<Points> pointsList8 = List.of(SEKOLINTSIKA);
        MARAIS.setPossibleDestinations(pointsList8);

        var randomWalks = new RandomWalks(ESTI, MARAIS);

        randomWalks.randomWalk();
        List<Points> paths = randomWalks.getPattern();

        assertEquals("ESTI", paths.getFirst().getName());
        assertEquals("MARAIS", paths.getLast().getName());
    }
}
