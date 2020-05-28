package Gamer;

import java.util.Scanner;

public class EntranceToGame {
    public static void gameSelection() {
        Scanner gameSelector = new Scanner(System.in);
        System.out.print("Какую игру предпочтете: \n" +
                "\"Загадать число\"\n" +
                "\"Угадать число\"\n" +
                "Напишите название игры:    ");
        String word = gameSelector.nextLine();
        switch (word) {
            case "Загадать число":
                System.out.print(" В этой игре вы загадываете число ");
                SecondGame.playGameTwo();
                break;
            case "Угадать число":
                System.out.println("Хороший выбор");
                FirstGame.playGameOne();
                break;
            case "выход":
                exitGame();
            default:gameSelection();
            case "Выход":
                exitGame();
        }
    }
    public static void exitGame () {
        System.exit(0);
}}
