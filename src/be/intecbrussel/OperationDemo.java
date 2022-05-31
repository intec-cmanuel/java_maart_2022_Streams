package be.intecbrussel;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperationDemo {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{2,6,7,1,55,62,11};

        // Eindbewerkingen / Eindoperaties.

        Stream.of(numbers)
                .forEach(number -> System.out.println("I have a number: " + number));

        Integer[] newArray = Stream.of(numbers)
                .filter(number -> number % 2 == 0)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(newArray));


        // Stream<T> | IntStream | LongStream | DoubleStream
        int[] smallIntArray = new int[]{2,5,6,3,2,4};

        int[] array = IntStream.of(smallIntArray)
                .filter(number -> number < 5)
                .toArray();

//        System.out.println(Arrays.toString(array));

        int sum = IntStream.of(smallIntArray)
                .sum();

        System.out.println("The sum is: " + sum);

        OptionalDouble average = IntStream.of(smallIntArray)
                .average();

        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }

        IntStream.of(smallIntArray)
                .sorted()
                .forEach(number -> System.out.println(number));
    }
}
