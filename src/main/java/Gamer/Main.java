package Gamer;

public class Main {
    public static void main(String[] args) {

     System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...");
    String userName = "";
    int userNumber;
    int number = 0;


        do {
        if (userName.equals("выход"))
            EntranceToGame.exitGame();
        else
            userName = UserRegistration.regName();
    } while (!UserRegistration.checkName(userName));

    User user = new User(UserRegistration.toTitleCase(userName));

        System.out.println("------------------------------------------------");
        System.out.println("Успешная регистрация пользователя " + user.getName());
        System.out.println("Добрый день, " + user.getName());
        System.out.println("------------------------------------------------");

        EntranceToGame.gameSelection();

}}
