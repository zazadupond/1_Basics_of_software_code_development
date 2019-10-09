package by.epam.stady.branching;

/* Найти max { min(a, b), min(c, d) }*/

public class Task2 {

    public static void main(String[] args) {

        MaxFromMin.searchMaxFromMin(12,13,14,15);

        System.out.printf(" максимальное значение двух групп " +
                "минимальных значений " +
                "(max { min(a, b), min(c, d) }) = %d ", MaxFromMin.searchMaxFromMin(12,13,14,15));
    }
}

class MaxFromMin {


    public static int searchMaxFromMin(int a, int b, int c, int d) {
        int min1 = MaxFromMin.searchMin(a,b);
        int min2 = MaxFromMin.searchMin(c,d);

        if ( min1 >= min2) {
            return min1;
        } else {
            return min2;
        }
    }

    public static int searchMin(int var1, int var2) {

        if (var1 <= var2) {
            return var1;
        } else {
            return var2;
        }
    }
}