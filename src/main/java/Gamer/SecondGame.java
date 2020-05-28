package Gamer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondGame {
    public static void playGameTwo() {

        String userAnswer;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println("Загадайте число, а я буду отгадывать \n пишите Больше, Меньше или Угадал");
        Scanner aswer = new Scanner(System.in);

        do {
            int middle;
            int high = numbers.size();
            middle = high / 2;
            System.out.println(numbers.get(middle));
            userAnswer = aswer.nextLine();
            if (userAnswer.equals("") || userAnswer.equals("Угадал")) {
                System.out.println("Вы выиграли!!!" );
                EntranceToGame.gameSelection();

            } else if (userAnswer.equals("больше") || userAnswer.equals("Больше")) {
                numbers.subList(0, middle).clear();

            } else if (userAnswer.equals("меньше") || userAnswer.equals("Меньше")) {
                numbers.subList(middle, numbers.size()).clear();

            } else if (userAnswer.equals("выход") || userAnswer.equals("Выход")) {
                EntranceToGame.exitGame();
            }
        } while (userAnswer.equals("больше") || userAnswer.equals("Больше")
                || userAnswer.equals("меньше") || userAnswer.equals("Меньше"));
        EntranceToGame.gameSelection();
    }
}
