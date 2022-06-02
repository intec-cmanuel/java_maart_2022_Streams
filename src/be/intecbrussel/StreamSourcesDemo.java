package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesDemo {
    public static void main(String[] args) {

        // bron van data
        Stream.of(new String[]{"Hello", "World", "Today", "is", "a", "good", "day"})
                .forEach(System.out::println);

        Stream.generate( () -> "Jean-Bon")
                .limit(20)
                .forEach(System.out::println);

        IntStream.range(0, 20)
                .forEach(System.out::println);

        IntStream.rangeClosed(50, 60)
                .forEach(System.out::println);

        int[] intArray = IntStream.rangeClosed(1, 100)
                .toArray();

        System.out.println(Arrays.toString(intArray));

        IntStream.iterate(1, carry -> carry + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
