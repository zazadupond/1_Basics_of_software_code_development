package by.epam.stady.branching;
/* Даны два угла треугольника ( в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.*/

public class Task1 {

    public static void main(String[] args) {

        Triangle.checkTriangle(45, 45);
    }
}

class Triangle {

    public static void checkTriangle(int angle1, int angle2) {

        if ( angle1 + angle2 < 180) {
            System.out.println(" Треугольник существует");

            if ( ((180 - angle1 - angle2) == 90) || (angle1 == 90) || (angle2 == 90)) {
                System.out.println(" Треугольник является прямоугольным");
            } else {
                System.out.println(" Треугольник НЕ является прямоугольным" );
            }

        } else {
            System.out.println(" Треугольника НЕ существует");
        }
    }
}
