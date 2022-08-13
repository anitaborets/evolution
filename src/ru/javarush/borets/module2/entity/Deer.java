package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Deer extends Animal implements Herbivores  {
    double foodCount = START_FOOD_COUNT;

    public Deer() {
        super(300, 4, 50, true, "\tu1F98C");
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
