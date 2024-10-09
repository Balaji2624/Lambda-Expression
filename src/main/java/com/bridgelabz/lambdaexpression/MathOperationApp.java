package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class NumberPlayList {

    private List<Integer> numberList = new ArrayList<>();

    // Add numbers to the list
    public void addNumber(Integer number) {
        numberList.add(number);
    }

    // Refactor to use Predicate interface for filtering even numbers
    public void iterateAndPrintEven(Predicate<Integer> filter) {
        numberList.forEach(number -> {
            if (filter.test(number)) { // Check if the number is even using Predicate
                System.out.println("Even number: " + number); // Print the number only if it's even
            }
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
        numberPlayList.addNumber(21);
        numberPlayList.addNumber(30);
        numberPlayList.addNumber(41);

        System.out.println("Iteration and print only even numbers:");
        // Use a lambda expression with Predicate to filter even numbers
        numberPlayList.iterateAndPrintEven(number -> number % 2 == 0);

        // If you want to demonstrate class, anonymous class, and lambda again, you can uncomment the following lines:

        System.out.println("\nIteration using Class:");
        numberPlayList.iterateUsingClass();

        System.out.println("\nIteration using Anonymous Class:");
        numberPlayList.iterateUsingAnonymousClass();

        System.out.println("\nIteration using Lambda:");
        numberPlayList.iterateUsingLambda();
    }
}



