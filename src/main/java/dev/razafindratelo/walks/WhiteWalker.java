package dev.razafindratelo.walks;

import dev.razafindratelo.destinations.Points;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class WhiteWalker {
    private Points currentPoint;
    private List<Points> pattern;
    private Points destinationPoint;

    public WhiteWalker(Points currentPlace, Points destination) {
        this.currentPoint = currentPlace;
        this.destinationPoint = destination;
        this.pattern = new ArrayList<>();

    }

    private static Points getRandomPoint(List<Points> possibleDestinations) {
        Random random = new Random();
        int randomIndex = random.nextInt(possibleDestinations.size());

        return possibleDestinations.get(randomIndex);
    }

    public void randomWalk() {
        this.pattern = new ArrayList<>();
        this.pattern.add(this.currentPoint);
        Points currentEmplacement = this.currentPoint;
        while(currentEmplacement != this.destinationPoint) {
            Points nextEmplacement = getRandomPoint(
                    currentEmplacement.getPossibleDestinations()
            );
            this.pattern.add(nextEmplacement);
            currentEmplacement = nextEmplacement;
        }
    }

    @Override
    public String toString() {
        return "RandomWalks{" +
                "currentPoint=" + currentPoint +
                ", pattern=" + pattern.toString() +
                ", destination=" + destinationPoint +
                '}';
    }
}
