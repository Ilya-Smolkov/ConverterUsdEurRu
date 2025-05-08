package StepTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System. in);
        printMenu();
        int userInput = scaner.nextInt();

        while (userInput !=0){
            //обработка разных случаев

            printMenu(); //печатаем меню еще раз, перед завершением текущего действия
            userInput = scaner.nextInt(); //повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu(){

    }
}
