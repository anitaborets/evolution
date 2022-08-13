package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pig extends Animal implements Herbivores {
    double foodCount = START_FOOD_COUNT;

    public Pig() {
        super(400, 2, 50, true, "\u1F416");
    }

    @Override
    public void move() {
    }


    @Override
    public Alive reproduce() {
        return null;
    }

    @Override
    public void eatPlant(Plant plant) {

    }
}
