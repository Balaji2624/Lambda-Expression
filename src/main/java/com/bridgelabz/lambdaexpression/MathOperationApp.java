package com.bridgelabz.lambdaexpression;

interface IMathFunction {
    int calculate(int a, int b);

    static void printResult(int a, int b, String functionName, IMathFunction mathFunction) {
        System.out.println(functionName + " of " + a + " and " + b + " is: " + mathFunction.calculate(a, b));
    }
}

public class MathOperationApp {
    public static void main(String[] args) {
        IMathFunction add = (x,y) -> x+y;
        IMathFunction substract = (x,y) -> x-y;
        IMathFunction multiply = (x,y) -> x*y;
        IMathFunction divide = (x,y) -> x/y;

        IMathFunction.printResult(5,4,"Addition",add);
        IMathFunction.printResult(5,4,"Substraction",substract);
        IMathFunction.printResult(5,4,"Multiply",multiply);
        IMathFunction.printResult(5,4,"Divide",divide);
    }
}
