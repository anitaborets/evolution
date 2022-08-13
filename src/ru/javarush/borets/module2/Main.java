package ru.javarush.borets.module2;

import ru.javarush.borets.module2.entity.Animal;
import ru.javarush.borets.module2.entity.Bear;
import ru.javarush.borets.module2.entity.Eagle;
import ru.javarush.borets.module2.entity.Plant;
import ru.javarush.borets.module2.entity.Wolf;
import ru.javarush.borets.module2.field.Field;
import ru.javarush.borets.module2.field.Spot;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Field field = new Field();
        field.getGameField();
        Bear bear = new Bear();
        System.out.println(bear);

        field.initialField();
        System.out.println(Arrays.deepToString(field.getGameField()));

    }
}
