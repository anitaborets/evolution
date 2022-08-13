package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mouse extends Animal implements Herbivores  {
    double foodCount = START_FOOD_COUNT;

    public Mouse() {
        super(0.05, 2, 1, true, "\u1F401");
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
