package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Goat extends Animal implements Herbivores {
    double foodCount = START_FOOD_COUNT;

    public Goat() {
        super(60, 3, 10, true, "\u1F410");
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
