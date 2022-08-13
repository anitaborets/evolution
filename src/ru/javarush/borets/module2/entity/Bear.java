package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Bear extends Animal implements Predator {
    double foodCount = START_FOOD_COUNT;

    public Bear() {
        weight = 500;
        speed = 2;
        amountOfFood = 80;
        eaten = false;
        view = "Bear";
    }

    @Override
    public String toString() {
        return view;
    }

    @Override
    public void move() {
    }

    @Override
    public Alive reproduce() {
        return new Bear();
    }

    @Override
    public void eat(Herbivores herbivores) {
    }

}
