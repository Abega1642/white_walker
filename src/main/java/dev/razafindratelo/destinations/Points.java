package dev.razafindratelo.destinations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class Points {
    private String name;
    private int number;
    private List<Point> possibleDestinations;
}
