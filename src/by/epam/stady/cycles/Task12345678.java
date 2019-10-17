package by.epam.stady.cycles;
/*
Task1 class SumOfNumbers - Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа

Task2 class StepInterval Вычислить значение функции на отрезке[a, b] с шагом h.
y = x, если x > 2 и y = -x, если x <= 2

Task3 class SumOfSquares Найти сумму квадратов первых 100 чисел*/



import java.util.Scanner;

public class Task12345678 {

    public static void main(String[] args) {

        //SumOfNumbers.numberInput(); //Task1 start
        //StepInterval.lineFun(1,3,0.01);//Task2 start
        SumOfSquares.sumSquares(3); //Task3 start
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

class StepInterval {

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

class SumOfSquares {

    public static void sumSquares(int number) {
        int sum = 0;
        for (int i = 0; i<= 100; i++ , number++) {
            sum += number*number;
        }
        System.out.println(sum);
    }
}