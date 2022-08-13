package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Buffalo extends Animal implements Herbivores {
    double foodCount = START_FOOD_COUNT;

    public Buffalo() {
        super(700, 3, 100, true, "\u1F403");
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


