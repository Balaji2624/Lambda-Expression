package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class NumberPlayList {

    // List to store numbers
    private List<Integer> numberList = new ArrayList<>();

    // Method to add numbers to the list
    public void addNumber(Integer number) {
        numberList.add(number);
    }

    // Method to iterate through the list using forEach
    public void iterateUsingClass() {
        // Using an external class implementation of Consumer
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer number) {
                System.out.println("Class-based iteration: " + number);
            }
        }

        // Iterate and print each element using an external class
        numberList.forEach(new MyConsumer());
    }

    // Method to iterate using an Anonymous class
    public void iterateUsingAnonymousClass() {
        // Using an anonymous class to implement Consumer
        numberList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println("Anonymous class iteration: " + number);
            }
        });
    }
    public void iterateUsingLambda() {
        // Using lambda function for iteration
        numberList.forEach(number -> System.out.println("Lambda iteration: " + number));
    }
}



public class MathOperationApp {
    public static void main(String[] args) {
        NumberPlayList numberPlayList = new NumberPlayList();

        // Add numbers to the list
        numberPlayList.addNumber(10);
        numberPlayList.addNumber(20);
        numberPlayList.addNumber(30);
        numberPlayList.addNumber(40);

        // Iterating using class
        System.out.println("Iteration using Class:");
        numberPlayList.iterateUsingClass();

        // Iterating using anonymous class
        System.out.println("\nIteration using Anonymous Class:");
        numberPlayList.iterateUsingAnonymousClass();

        // Iterating using lambda expression
        System.out.println("\nIteration using Lambda:");
        numberPlayList.iterateUsingLambda();

    }
}


