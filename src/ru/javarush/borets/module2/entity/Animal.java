package ru.javarush.borets.module2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Getter
@ToString
public abstract class Animal extends Alive implements Activity {
    public static final int START_FOOD_COUNT = 1;

    static double weight;
    static int speed;
    static double amountOfFood;
    static boolean eaten;
    static String view;

    public Animal(double weight, int speed, double amountOfFood, boolean eaten, String view) {
    }

    public Animal() {
    }
}
