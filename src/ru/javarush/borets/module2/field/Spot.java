package ru.javarush.borets.module2.field;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import ru.javarush.borets.module2.entity.Alive;
import ru.javarush.borets.module2.entity.Wolf;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
public class Spot {
    List<Alive> entities = new ArrayList<>();
    private int x;
    private int y;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addEntity(Alive entity){
        entities.add(entity);
    }
    public void removeEntity(Alive entity){
        entities.remove(entity);
    }

}
