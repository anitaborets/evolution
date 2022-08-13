package ru.javarush.borets.module2.entity;

public interface Liveable {

    public static void die(Alive alive){
        alive=null;
    }
    public Alive reproduce();
}
