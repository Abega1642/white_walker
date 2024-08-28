import dev.razafindratelo.destinations.Points;
import dev.razafindratelo.walks.WhiteWalker;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingWhiteWalker {

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

        HEI.setPossibleDestinations(List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA));
        PULLMAN.setPossibleDestinations(List.of(HEI, NEXTA, BALANCOIR));
        BALANCOIR.setPossibleDestinations(List.of(HEI, PULLMAN, BOULEVARD, ESTI));
        NEXTA.setPossibleDestinations(List.of(PULLMAN));
        ESTI.setPossibleDestinations(List.of(BOULEVARD, BALANCOIR));
        BOULEVARD.setPossibleDestinations(List.of(BALANCOIR, ESTI));
        SEKOLINTSIKA.setPossibleDestinations(List.of(HEI, MARAIS));
        MARAIS.setPossibleDestinations(List.of(SEKOLINTSIKA));

        var white_walker = new WhiteWalker(HEI, ESTI);

        white_walker.randomWalk();
        List<Points> paths = white_walker.getPattern();

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

        HEI.setPossibleDestinations(List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA));
        PULLMAN.setPossibleDestinations(List.of(HEI, NEXTA, BALANCOIR));
        BALANCOIR.setPossibleDestinations(List.of(HEI, PULLMAN, BOULEVARD, ESTI));
        NEXTA.setPossibleDestinations(List.of(PULLMAN));
        ESTI.setPossibleDestinations(List.of(BOULEVARD, BALANCOIR));
        BOULEVARD.setPossibleDestinations(List.of(BALANCOIR, ESTI));
        SEKOLINTSIKA.setPossibleDestinations(List.of(HEI, MARAIS));
        MARAIS.setPossibleDestinations(List.of(SEKOLINTSIKA));

        var white_walker = new WhiteWalker(MARAIS, BOULEVARD);

        white_walker.randomWalk();
        List<Points> paths = white_walker.getPattern();

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

        HEI.setPossibleDestinations(List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA));
        PULLMAN.setPossibleDestinations(List.of(HEI, NEXTA, BALANCOIR));
        BALANCOIR.setPossibleDestinations(List.of(HEI, PULLMAN, BOULEVARD, ESTI));
        NEXTA.setPossibleDestinations(List.of(PULLMAN));
        ESTI.setPossibleDestinations(List.of(BOULEVARD, BALANCOIR));
        BOULEVARD.setPossibleDestinations(List.of(BALANCOIR, ESTI));
        SEKOLINTSIKA.setPossibleDestinations(List.of(HEI, MARAIS));
        MARAIS.setPossibleDestinations(List.of(SEKOLINTSIKA));

        var white_walker = new WhiteWalker(SEKOLINTSIKA, HEI);

        white_walker.randomWalk();
        List<Points> paths = white_walker.getPattern();

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

        HEI.setPossibleDestinations(List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA));
        PULLMAN.setPossibleDestinations(List.of(HEI, NEXTA, BALANCOIR));
        BALANCOIR.setPossibleDestinations(List.of(HEI, PULLMAN, BOULEVARD, ESTI));
        NEXTA.setPossibleDestinations(List.of(PULLMAN));
        ESTI.setPossibleDestinations(List.of(BOULEVARD, BALANCOIR));
        BOULEVARD.setPossibleDestinations(List.of(BALANCOIR, ESTI));
        SEKOLINTSIKA.setPossibleDestinations(List.of(HEI, MARAIS));
        MARAIS.setPossibleDestinations(List.of(SEKOLINTSIKA));

        var white_walker = new WhiteWalker(ESTI, MARAIS);

        white_walker.randomWalk();
        List<Points> paths = white_walker.getPattern();

        assertEquals("ESTI", paths.getFirst().getName());
        assertEquals("MARAIS", paths.getLast().getName());
    }
}
