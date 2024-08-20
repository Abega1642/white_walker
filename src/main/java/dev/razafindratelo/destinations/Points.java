package dev.razafindratelo.destinations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Points {
    private String name;
    private int number;
    private List<Points> possibleDestinations;

    public Points(String name, int number) {
        this.name = name;
        this.number = number;
        this.possibleDestinations = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Points{" +
                "name='" + name
                +"}";
    }
}
