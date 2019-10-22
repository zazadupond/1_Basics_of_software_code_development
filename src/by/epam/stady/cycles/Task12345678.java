package by.epam.stady.cycles;
/*
Task1 class SumOfNumbers - Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа

Task2 class StepInterval Вычислить значение функции на отрезке[a, b] с шагом h.
y = x, если x > 2 и y = -x, если x <= 2

Task3 class SumOfSquares Найти сумму квадратов первых 100 чисел.

Task4 class SquareMultiplication Составить программу нахождения произведения квадратов первых двухсот чисел.

Task5 class NumberSeries Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
модуль которых больше или равен заданному e.
Общий член ряда имеет вид: an = (1/2 в степени n) + (1/3 в степени n).

Task6 class NumberSymbol Вывести на экран соответствий между
символами и их численными обозначениями в памяти компьютера.

Task7 Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.

Task8 Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task12345678 {

    public static void main(String[] args) {

        //SumOfNumbers.numberInput(); //Task1 start
        //StepInterval.lineFun(1,3,0.01);//Task2 start
        //SumOfSquares.sumSquares(3); //Task3 start
        //SquareMultiplication.squareMul(15.3); //Task4 start
        //NumberSeries.sumRow(0.0001 ); //Task5 start
        //NumberSymbol.numberSymbol(); //Task6 start
        //DivisorsOfNaturalNumber.divNatNumb(); //Task7 start
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

class StepInterval { //Task2

    public static void lineFun(double a, double b, double h) {
        double x, y;

        for ( x = a ; x <=b; x+=h ) {
            if (x > 2) {
                y = x;
                System.out.printf("Зн фун на отрезке[%.2f, %.2f] с шагом %.2f равен %.2f",a ,b ,h ,y );
                System.out.println("");
            } else {
                y = x;
                System.out.printf("Значение функции на отрезке[%.2f, %.2f] с шагом %.2f равен -%.2f",a ,b ,h ,y );
                System.out.println("");
            }
        }
    }
}

class SumOfSquares { //Task3

    public static void sumSquares(int number) {
        int sum = 0;
        for (int i = 0; i<= 100; i++ , number++) {
            sum += number*number;
        }
        System.out.println(sum);
    }
}

class SquareMultiplication { //Task4

    public static void squareMul(double number) {
        double totalSquare = 1;
        for (int i = 0 ; i <= 200; i++ , number++) {
            totalSquare *= number*number;
        }
        System.out.printf("%.5f ",totalSquare);
    }
}

class NumberSeries { //Task5

    public static void sumRow(double e) {

        double sum = 0;
        for (double n = 1; ((1/Math.pow(2,n)) + (1/Math.pow(3,n)))>= e; n++) {
        sum += ((1/Math.pow(2,n)) + (1/Math.pow(3,n)));
        }

        System.out.println(sum);

    }
}

class NumberSymbol { //Task6
    public static void numberSymbol() {
        for (short i = -32768; i < 32767; i++) {
            System.out.printf("%s %c \n", Integer.toBinaryString(i), (char)i);
        }
    }
}

class DivisorsOfNaturalNumber { //Task7

    public static void divNatNumb() {
        int m = 0;
        int n = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители");

            System.out.print("Введите m :");
            m = Integer.parseInt(reader.readLine());

            System.out.print("Введите n :");
            n = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }



        for (int i = m ;i<=n;i++){
            if (i > 0) {
                System.out.print(i +" ");
                for (int j = 2; j < i; j++ ) {
                    if (i % j == 0){
                        System.out.print(i / j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}

