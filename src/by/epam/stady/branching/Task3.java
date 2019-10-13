package by.epam.stady.branching;

/*Даны три почки A(x1, y1), B(x2, y2), C(x3, y3). Определить, будут ли они расположены на одной прямой*/

public class Task3 {

    public static void main(String[] args) {
        
        PointStraight.linePoint(1, 2, 3, 4, 4, 5);
    }
}

class PointStraight {

    public static void linePoint(int x1, int y1, int x2, int y2, int x3, int y3) {

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) { /*Точки 1, 2, 3 - лежат на одной прямой */

            System.out.println("Точки расположены на одной прямой");

        } else {

            System.out.println("Точки НЕ расположены на одной прямой");

        }
    }
}
