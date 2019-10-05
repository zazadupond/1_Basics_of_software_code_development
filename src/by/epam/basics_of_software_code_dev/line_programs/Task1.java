package by.epam.basics_of_software_code_dev.line_programs;

import java.util.Scanner;

// найдите значение функции: z = ( ( a - 3 ) * b / 2 ) + c
public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Поик значения функции: z = ( ( a - 3 ) * b / 2 ) + c");
        System.out.println("Input value a");
        int a = scan.nextInt();
        System.out.println("Input value b");
        int b = scan.nextInt();
        System.out.println("Input value c");
        int c = scan.nextInt();

        System.out.println("Значение функции ( a - 3 ) * b / 2 ) + c будет равно " + ( (( a - 3 ) * b / 2 ) + c ));
    }
}

