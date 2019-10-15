package by.epam.stady.branching;

/*Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич
* через отверстие.*/

public class Task4 {

    public static void main(String[] args) {

        CapacityCheck capacityCheck = new CapacityCheck();
        capacityCheck.check(new Brick(1, 1, 2), new HoleInTheWall(4,4));

    }
}

class Brick {
    int x;
    int y;
    int z;

    Brick(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
}

class HoleInTheWall {

    int a;
    int b;

    HoleInTheWall(int a, int b) {

        this.a = a;
        this.b = b;
    }
}

class CapacityCheck {

    public void check(Brick brick, HoleInTheWall wall) {
        if ((brick.x <= wall.a & brick.y <= wall.b)
                | (brick.x <= wall.a & brick.z <= wall.b)
                | (brick.y <= wall.a & brick.x <= wall.b)
                | (brick.y <= wall.a & brick.z <= wall.b)
                | (brick.z <= wall.a & brick.y <= wall.b)
                | (brick.z <= wall.a & brick.x <= wall.b))
                {
                    System.out.println("Кирпич пройдет через отверстие в стене");

                } else {

            System.out.println("Кирпич НЕ пройдет через отверстие в стене");
        }
    }
}