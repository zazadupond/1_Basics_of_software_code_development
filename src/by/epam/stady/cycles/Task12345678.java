package by.epam.stady.cycles;
/*
Task1 class SumOfNumbers - Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа

Task2 */

import java.util.Scanner;

public class Task12345678 {

    public static void main(String[] args) {

        SumOfNumbers.numberInput(); //Task1 start
    }
}

class SumOfNumbers { //Task1

    public static void numberInput() {

        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println(" Введите любое целое положительное число ");
            while (!input.hasNextInt() ) {
                System.out.println("Неверный вод " + input.nextLine() + " - Это не число");
            }
            number = input.nextInt();
        } while (number < 1 );
        System.out.println("Вы ввели целое положительное число " + number);
        input.close();



        int summAllNumber = 0;
        for (int i = 1 ; i <= number; i++){
            summAllNumber+=i;
        }
        System.out.println("Cумма всех чисел от 1 до " + number + " = " + summAllNumber);

    }
}


