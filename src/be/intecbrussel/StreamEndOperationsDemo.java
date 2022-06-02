package be.intecbrussel;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEndOperationsDemo {
    public static void main(String[] args) {

        // End Operations
        IntStream.rangeClosed(1, 10).forEach(number -> System.out.println(number));

        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("The sum is: " + sum);

        OptionalDouble optionalAverage = IntStream.rangeClosed(1,10).average();
        if (optionalAverage.isPresent()) {
            System.out.println(optionalAverage.getAsDouble());
        }

        OptionalInt optionalSmallestNumber = IntStream.rangeClosed(1,10).min();
        if (optionalSmallestNumber.isPresent()) {
            System.out.println(optionalSmallestNumber.getAsInt());
        }

        int product = IntStream.rangeClosed(1,10)
                .reduce(1, (carry, e) -> carry * e);
        System.out.println(product);

        String text = Stream.of(new String[]{"Hello", "World", "Today", "is", "a", "good", "day"})
                .reduce("", (carry, e) -> carry.concat(e).concat(" "));
        System.out.println(text);

        int[] intArray = IntStream.rangeClosed(1,10)
                .filter(number -> number % 2 != 0)
                .toArray();

        System.out.println(Arrays.toString(intArray));

        String[] strArray = Stream.of(new String[]{"Hello", "World", "Today", "is", "a", "good", "day"})
                .filter(word -> word.length() < 5)
                .toArray(String[]::new);
    }
}
