package by.epam.stady.line_programs;

// Вычислить значение выражения по формуле ((sin x + cos Y ) / (cos x - sin y)) * tg xy

public class Task3 {

    public static void main(String[] args) {
        MathExpressionSinCosClass.mathematicalExpression(5,5);
    }
}

class MathExpressionSinCosClass {

    public static void mathematicalExpression(double varX, double varY){

        System.out.println(
                ((Math.sin(varX) + Math.cos(varY) )
                / (Math.cos(varX) - Math.sin(varY)))
                * Math.tan(varX*varY));

    }
}
