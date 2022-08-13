package ru.javarush.borets.module2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Caterpillar implements Liveable {
    private final double weight = 0.01;
    //private final int maxQuantity = 200;
    private final String view = "\u1F41B";
    private final boolean eaten = true;

    public Caterpillar() {

    }


    @Override
    public Alive reproduce() {
        return null;
    }
}
