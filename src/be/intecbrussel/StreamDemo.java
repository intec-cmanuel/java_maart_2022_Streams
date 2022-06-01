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
        Double[] dArr = new Double[]{4.6,5.5,63.1};

        Stream<Double> stream = Stream.of(dArr);
        stream = stream.filter(number -> number < 50);
        stream = stream.map(number -> number * 2);
        stream = stream.limit(3);
        stream.forEach(number -> System.out.println("- " + number));




        Stream<Double> stream2 = Stream.of(dArr);
        Stream<Double> stream3 = stream2.filter(number -> number < 50);
        Stream<Double> stream4 = stream3.map(number -> number * 2);
        stream4 = stream4.limit(3);
        stream4.forEach(number -> System.out.println("- " + number));

        stream3.forEach(number -> System.out.println(number));





        Stream.of(arr)
                .filter(number -> number < 50)
                .map(number -> number * 2)
                .limit(3)
                .forEach(number -> System.out.println("- " + number));

    }
}
