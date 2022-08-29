package ru.javarush.borets.module2.statistic;

import ru.javarush.borets.module2.entity.Alive;

import java.util.ArrayList;
import java.util.HashMap;

public class EntityCounterForMap extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public EntityCounterForMap(Class<?> baseType) {
        this.baseType = baseType;
    }

    public static HashMap<Class<?>, Integer> getStatisticForCalculation (ArrayList<? extends Alive> listOfAnimals) {
        EntityCounterForMap count = new EntityCounterForMap(Alive.class);
        for (Object alive : listOfAnimals) {
            if (!(alive == null))
                count.count((Alive) alive);
        }
        return count;

    }

    private void count(Object object) {
        Class<?> type = object.getClass();
        if (!baseType.isAssignableFrom(type))
            throw new RuntimeException(object + "wrong type " + type);
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass))
            countClass(superClass);
    }

}

