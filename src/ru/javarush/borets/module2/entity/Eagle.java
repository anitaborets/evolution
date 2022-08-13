package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eagle extends Animal implements Flyable,Predator {
    double foodCount = START_FOOD_COUNT;

    public Eagle() {
        super(6, 3, 1, false, "\u1F985");
    }

    @Override
    public void move() {
    }

    @Override
    public void fly() {

    }

    @Override
    public Alive reproduce() {
        return null;
    }

    @Override
    public void eat(Herbivores herbivores) {
    }

    @Override
    public String toString() {
        return view;
    }
}
