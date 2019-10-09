package by.epam.stady.line_programs;

/* Для данной области составить линейную программу, кторая печатает true,
если точка с координатами(x, y) принадлежит закрашенной области,
и false - в противном случае: " изображение.
Мое описание области через координаты -4 -3; -4 0; -2 0; -2 4; 2 4; 2 0; 4 0; 4 -3;
*/
public class Task6 {
    public static void main(String[] args) {

        Field.inscribedInTheField(-5, -3);

    }
}

class Field {

    public static void inscribedInTheField(int coordinateX, int coordinateY){

        boolean inscribed =
                        (-4 <= coordinateX & coordinateX <= 0) & (-3 <= coordinateY & coordinateY <= 0) |   // -4 -3
                        (-4 <= coordinateX & coordinateX <= 0) & (coordinateY == 0) |                       // -4  0
                        (-2 <= coordinateX & coordinateX <= 0) & (coordinateY == 0) |                       // -2  0
                        (-2 <= coordinateX & coordinateX <= 0) & ( 0 <= coordinateY & coordinateY <= 4) |   // -2  4
                        ( 0 <= coordinateX & coordinateX <= 2) & ( 0 <= coordinateY & coordinateY <= 4) |   //  2  4
                        ( 0 <= coordinateX & coordinateX <= 2) & (coordinateY == 0) |                       //  2  0
                        ( 0 <= coordinateX & coordinateX <= 4) & (coordinateY == 0) |                       //  4  0
                        ( 0 <= coordinateX & coordinateX <= 4) & (-3 <= coordinateY & coordinateY <= 0) ;   //  4 -3

        System.out.println(inscribed);
    }
}