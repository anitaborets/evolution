package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boa extends Animal implements Predator {
    double foodCount = START_FOOD_COUNT;

    public Boa() {
        super(15, 1, 3, true, "\u1F40D");
    }

    @Override
    public void move() {
    }


    @Override
    public Alive reproduce() {
        return new Boa();
    }

    @Override
    public void eat(Herbivores herbivores) {

    }
}
