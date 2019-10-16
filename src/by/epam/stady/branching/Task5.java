package by.epam.stady.branching;
/*Вычислить значение функции: F(x) = x в квадрате - 3x + 9, усли x <= 3; либо 1 /(x в кубе + 6), если x > 3 */

public class Task5 {

    public static void main(String[] args) {

        double x = 5;

        System.out.printf("Значение функции F(%.2f) = %.2f", x, Condition.funF(x));

    }

}

class Condition {

    public static double funF(double x) {

        if (x <= 3) {
            return (Double)(Math.pow(x,2) - 3 * x + 9);
        } else {

            return (Double)(Math.pow(x, 3) + 6) ;

        }
    }
}
