package ru.javarush.borets.module2.lifeCycle;

import ru.javarush.borets.module2.entity.Alive;
import ru.javarush.borets.module2.entity.Animal;
import ru.javarush.borets.module2.entity.Plant;
import ru.javarush.borets.module2.statistic.EntityCounter;
import ru.javarush.borets.module2.statistic.StatisticReport;

import java.util.ArrayList;
import java.util.Random;


import static ru.javarush.borets.module2.Entities.PLANT;
import static ru.javarush.borets.module2.Main.log;
import static ru.javarush.borets.module2.factory.MaxQuantity.maxQuantity;
import static ru.javarush.borets.module2.field.Field.gameField;

public class StartNextDay {
    public static ArrayList<Alive> startDay = new ArrayList<>();
    public static StringBuilder report = new StringBuilder();

    static Random random = new Random();
    static double foodCountAfterNight = 0;
    static int quantityPlant = 0;
    static int deadAnimals = 0;


    public static void startNextDay(ArrayList<Alive>[][] gameField) {
        StatisticReport reportStartDay = new StatisticReport();
        report.setLength(0);

        grownPlant();
        diedStarvation();
        wantEatAgain();

        updateDayListOfAnimals();
        reportStartDay.printInfoAboutLifeDay(StartNextDay.report);
    }

    private static void diedStarvation() {
        for (int row = 1; row < gameField.length - 1; row++) {
            for (int column = 1; column < gameField[0].length - 1; column++) {

                for (int i = 0; i < gameField[row][column].size(); i++) {

                    if (gameField[row][column].get(i) instanceof Animal) {
                        foodCountAfterNight = ((Animal) gameField[row][column].get(i)).getFoodCount() / 2;
                        ((Animal) gameField[row][column].get(i)).setAmountOfFood(foodCountAfterNight);
                        if (((Animal) gameField[row][column].get(i)).getFoodCount() == 0) {
                            log.info(gameField[row][column].get(i).getClass().getSimpleName() + " is died");
                            gameField[row][column].remove(i);
                            deadAnimals++;
                        }
                    }
                }
            }
        }
        report.append("Some of the animals died.The population of the island has decreased by: ").append(deadAnimals).append("\n");
    }

    private static void grownPlant() {
        for (int row = 1; row < gameField.length - 1; row++) {
            for (int column = 1; column < gameField[0].length - 1; column++) {

                for (int i = 0; i < gameField[row][column].size(); i++) {
                    if (gameField[row][column].get(i) instanceof Plant) {
                        quantityPlant++;
                    }
                }
                int difference = maxQuantity.get(PLANT) - quantityPlant;
                if (difference > 0) {
                    for (int i = 0; i < random.nextInt(difference); i++) {
                        Plant plant = new Plant();
                        gameField[row][column].add(plant);
                        quantityPlant++;
                    }
                }
            }
        }
        report.append("**************").append("\n").append("Start new day. Plant has grown, total Plant: ").append(quantityPlant).append("\n");

    }

    private static void wantEatAgain() {
        for (int row = 1; row < gameField.length - 1; row++) {
            for (int column = 1; column < gameField[0].length - 1; column++) {

                for (int i = 0; i < gameField[row][column].size(); i++) {

                    if (gameField[row][column].get(i) instanceof Animal) {
                        ((Animal) gameField[row][column].get(i)).isAte = false;
                    }
                }
            }
        }
    }

    private static void updateDayListOfAnimals() {
        for (int row = 1; row < gameField.length - 1; row++) {
            for (int column = 1; column < gameField[0].length - 1; column++) {
                startDay.addAll(gameField[row][column]);
            }
        }

        report.append("Animals before start new day: ")
                .append(startDay.size())
                .append("\n")
                .append("They are: ")
                .append(EntityCounter.getStatistic(startDay));

    }
}



