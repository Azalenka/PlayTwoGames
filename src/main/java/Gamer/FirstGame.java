package Gamer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstGame {


    public static void playGameOne() {
        String ex = "выход";
        int UnknownNumber, UserNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Угадате число (от 0 до 100).");
        UnknownNumber = (int) Math.floor(Math.random() * 100);

        try {
            do {
                System.out.print("Введите ваше число: ");
                UserNumber = input.nextInt();
                if (UserNumber > UnknownNumber) {
                    System.out.println();
                    System.out.println("Моё число меньше.");

                } else if (UserNumber < UnknownNumber) {
                    System.out.println();
                    System.out.println("Моё число больше.");

                } else {
                    System.out.println("Поздравляю!\n Вы угадали!" );
                }
            } while (UserNumber != UnknownNumber);
            EntranceToGame.gameSelection();
        } catch (InputMismatchException e) {
            System.out.println("Не корректно введено число, введите число повторно.");
            playGameOne();
        }
    }
}
