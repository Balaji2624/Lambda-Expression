package com.bridgelabz.lambdaexpression;

interface IMathFunction
{
    int calculate(int a, int b);
}

public class MathOperationApp {
    public static void main(String[] args) {
        IMathFunction add = (x,y) -> x+y;
        IMathFunction substract = (x,y) -> x-y;
        IMathFunction multiply = (x,y) -> x*y;
        IMathFunction divide = (x,y) -> x/y;

        System.out.println("Addition is : "+add.calculate(5,4));
        System.out.println("Addition is : "+substract.calculate(5,4));
        System.out.println("Addition is : "+multiply.calculate(5,4));
        System.out.println("Addition is : "+divide.calculate(5,4));
    }
}
