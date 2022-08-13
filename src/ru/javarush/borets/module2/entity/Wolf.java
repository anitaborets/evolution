package ru.javarush.borets.module2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Wolf extends Animal implements Predator {
    private double foodCount = START_FOOD_COUNT;
    public final String name = String.valueOf(Entities.WOLF);

    public Wolf() {
        super(50, 3, 8, false, "\u1F43A");
    }

    public Wolf(double weight, int speed, double amountOfFood, boolean eaten, String view, double foodCount) {
        super(50, 3, 8, false, "\u1F43A");
        this.foodCount = foodCount;
    }

    @Override
    public void move() {
    }

    @Override
    public void eat(Herbivores herbivores) {

    }

    @Override
    public Alive reproduce() {
        return new Wolf();
    }

    @Override
    public String toString() {
        return view;
    }
}
