package Lesson04HT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gerka on 11-Jun-17.
 */
public class Queue {
    public static void main(String[] args) {
        // Переменные
        ArrayList<String> people = new ArrayList<>(); //Список людей внутри
        Scanner scanner = new Scanner(System.in);     //Сканер
        int counter = 0;       //Счетчик людей внутри
        boolean exit = false;  //индикатор: нужно ли прекращать процедуру
        int peopleNumber = 5;  // Колличество людей, которые могут находиться в кабинете

        // Процесс
        while (!exit) {
            askUser();                           //Предложение ввести вариант запроса
            String command = scanner.nextLine(); //Считывание ответа

            // Определение того, что выполнять
            switch (command) {
                case "1": // Добавить человека в кабинет
                    counter++;
                    people.add(addNewcomer(counter));
                    break;
                case "2": // Вывести список людей в кабинете
                    printPeople(counter, peopleNumber, people);
                    break;
                case "3": // Прекратить прийом
                    System.out.println("Спасибо!");
                    printPeople(counter, peopleNumber, people);
                    exit = true;
                    break;
                default: //Непредвиденное значение - просьба повторить ввод
                    System.out.println("Такой команды нет. Введите 1, 2 или 3.");
                    break;
            }
        }
    }

    // МЕТОДЫ, КОТОРЫЕ ВЫЗЫВАЮТЬСЯ

    public static void askUser() { //Предложение ввести вариант запроса
        System.out.println("Что хотите сделать?");
        System.out.println("1 - запустить нового человека; 2 - получить сисок людей внутри; 3 - прекратить прийом");
    }

    public static String addNewcomer(int counter) { // Добавить человека в кабинет
        String newcomer = "Человек" + counter;             // Создание нового человека
        System.out.println(newcomer + " зашел в кабинет"); // Оповещение о появлении нового человека
        return newcomer;
    }

    public static void printPeople(int counter, int peopleNumber, ArrayList<String> people) { // Вывести список людей в кабинете
        if (counter == 0) {              // Если в кабенете нет людей
            System.out.println("В кабинете пока нет людей");
        }
        else {
            System.out.println("Cписок людей в кабинете:");

            if (counter < peopleNumber) {    // Если в кабенете меньше 5 людей
                for (int i = 0; i < counter; i++) {
                    System.out.println(people.get(i));
                }
            }
            if (counter >= peopleNumber) {  // Если в кабенете 5 и более людей
                for (int j = counter - peopleNumber; j < counter; j++) {
                    System.out.println(people.get(j));
                }
            }
        }
    }
}
