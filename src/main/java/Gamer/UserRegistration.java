package Gamer;

import java.util.Scanner;

public class UserRegistration {

    public static  boolean checkName(String name){
    if (name.equals("")||name.contains(" ")){
        System.out.println(name+" имя содержит некорректные символы(пробелы или цифры). Повторите ввод:");
        return false ;       }
    else System.out.println(name + " имя введено корректно. ");
    return true;
}
    public  static String regName(){
        System.out.println("Введите имя: \n"+"Покинуть игру возможно набрав \"выход\"");
        return new Scanner(System.in).nextLine();

    }
    public static String toTitleCase(String name)
    { return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}







//||name.matches("")