package ru.javarush.borets.module2.field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.javarush.borets.module2.entity.Alive;
import ru.javarush.borets.module2.entity.Boa;
import ru.javarush.borets.module2.entity.Eagle;
import ru.javarush.borets.module2.entity.Sheep;
import ru.javarush.borets.module2.entity.Wolf;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class Field {
    //private int sizeX = 5;
    //private int sizeY = 5;
    private Eagle[][] gameField = new Eagle[5][5];

    public void initialField(){
        gameField[1][1] = new Eagle();
       // gameField[0][0] = new Spot(new Boa(),1,0);
       // gameField[0][0] = new Spot(new Sheep(),2,0);
    }

}

