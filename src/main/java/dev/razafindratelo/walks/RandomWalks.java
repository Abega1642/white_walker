package dev.razafindratelo.walks;

import dev.razafindratelo.destinations.Points;
import lombok.Data;
import lombok.ToString;
import java.util.List;
import java.util.Random;

@Data
@ToString
public class RandomWalks {
    private Points points;
    private List<Points> pointsList;
    private List<Points> pattern;
    private Points destination;

    public RandomWalks(Points points, List<Points> pointsList, Points destination) {
        this.points = points;
        this.pointsList = pointsList;
        this.destination = destination;

    }
    public static Points getRandomPoint(List<Points> pointsList) {
        List<Integer> pointsCoordinates = pointsList
                .stream()
                .map(Points::getNumber)
                .toList();
        Random random = new Random();
        int randomIndex = random.nextInt(pointsCoordinates.size());
        int randomNumber = pointsCoordinates.get(randomIndex);

        return pointsList.get(randomIndex);
    }

}
