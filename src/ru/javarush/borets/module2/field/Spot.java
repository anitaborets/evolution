package ru.javarush.borets.module2.field;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import ru.javarush.borets.module2.entity.Alive;
import ru.javarush.borets.module2.entity.Wolf;

@EqualsAndHashCode
@Getter
@Setter
public class Spot {
    private Wolf wolf;
    private int x;
    private int y;

    public Spot(Wolf wolf, int x, int y) {
                this.wolf = wolf;
        this.x = x;
        this.y = y;
    }
}
