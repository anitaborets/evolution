package ru.javarush.borets.module2.entity;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

public class Edibility {

    static final EnumMap<Entities, List<String>> edibility = new EnumMap<Entities, List<String>>(Entities.class);

    public static EnumMap<Entities, List<String>> getEdibility() {
        edibility.put(Entities.WOLF, Arrays.asList(Entities.HORSE.name(),Entities.DEER.name()));
              return edibility;
    }
}
