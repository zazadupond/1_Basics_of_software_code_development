package by.epam.stady.line_programs;

public class Task2 {
    public static void main(String[] args) {

        MathExpressionClass.mathematicalExpression(555555555,-55555,2222);

    }

}
class MathExpressionClass {

    private double variableA;
    private double variableB;
    private double variableC;
    private static double variableMathExpr;

    public static void mathematicalExpression(double variableA, double variableB, double variableC ) {

        variableMathExpr = ((variableB + (Math.sqrt((variableB*variableB)
                + (4 * variableA * variableC))))
                / (2 * variableA))
                - ((variableA * variableA * variableA) * variableC)
                + Math.pow(variableB,-2); 

        System.out.println(variableMathExpr);

    }
}
