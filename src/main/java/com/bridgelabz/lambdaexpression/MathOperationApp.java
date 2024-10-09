package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class NumberPlayList {

    private List<Integer> numberList = new ArrayList<>();

    // Add numbers to the list
    public void addNumber(Integer number) {
        numberList.add(number);
    }

    // Refactor to use Function interface for conversion
    public void iterateWithConversion(Function<Integer, Double> converter) {
        // Using forEach with conversion logic
        numberList.forEach(number -> {
            Double convertedNumber = converter.apply(number); // Convert number to double
            System.out.println("Converted iteration: " + convertedNumber); // Print the converted number
        });
    }

    // You can still keep your previous methods if you like
    public void iterateUsingClass() {
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer number) {
                System.out.println("Class-based iteration: " + number);
            }
        }

        numberList.forEach(new MyConsumer());
    }

    public void iterateUsingAnonymousClass() {
        numberList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println("Anonymous class iteration: " + number);
            }
        });
    }

    public void iterateUsingLambda() {
        numberList.forEach(number -> System.out.println("Lambda iteration: " + number));
    }
}

public class MathOperationApp {
    public static void main(String[] args) {
        NumberPlayList numberPlayList = new NumberPlayList();

        numberPlayList.addNumber(10);
        numberPlayList.addNumber(20);
        numberPlayList.addNumber(30);
        numberPlayList.addNumber(40);

        System.out.println("Iteration with conversion to double:");
        // Use a lambda expression to convert Integer to Double by doubling the value
        numberPlayList.iterateWithConversion(number -> number.doubleValue());

        // If you want to demonstrate class, anonymous class, and lambda again, you can uncomment the following lines:

         System.out.println("\nIteration using Class:");
         numberPlayList.iterateUsingClass();

         System.out.println("\nIteration using Anonymous Class:");
         numberPlayList.iterateUsingAnonymousClass();

         System.out.println("\nIteration using Lambda:");
         numberPlayList.iterateUsingLambda();
    }
}


