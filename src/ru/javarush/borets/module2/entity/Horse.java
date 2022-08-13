package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Horse extends Animal implements Herbivores {
    double foodCount = START_FOOD_COUNT;
    public static final String name = String.valueOf(Entities.HORSE);

    public Horse() {
        super(400, 4, 60, true, "\u1F40E");
    }

    @Override
    public void move() {
    }

    @Override
    public void eatPlant(Plant plant) {

    }


    @Override
    public Alive reproduce() {
        return null;
    }
}
