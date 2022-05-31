package be.intecbrussel;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        withoutStreams();
        withStreams();
    }

    private static void withoutStreams() {
        int[] arr = new int[]{45,88,5,66,54,12,35,88,41,52,12};

        int counter = 0;
        for (int number : arr) {
            if (counter >= 3) {
                break;
            }

            if (number < 50) {
                int product = number * 2;
                System.out.println(product);
                counter++;
            }
        }

    }

    private static void withStreams() {
        Integer[] arr = new Integer[]{45,88,5,66,54,12,35,88,41,52,12};

        Stream.of(arr)
                .filter(number -> number < 50)
                .map(number -> number * 2)
                .limit(3)
                .forEach(number -> System.out.println("- " + number));

    }
}
