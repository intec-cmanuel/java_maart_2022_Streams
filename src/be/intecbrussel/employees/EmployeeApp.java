package be.intecbrussel.employees;

import java.util.Comparator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee jean = new Employee("Jean", 3000);
        Employee bernard = new Employee("bernard", 2800);
        Employee jaqueline = new Employee("Jaqueline", 5000);
        Employee pierre = new Employee("pierre", 1500);
        Employee amber = new Employee("Amber", 500);

        Employee[] people = new Employee[]{jean, bernard, jaqueline,pierre, amber};

//        Stream.of(people)
//                .filter(person -> person.getSalary() > 2000)
//                .forEach(System.out::println);

//        Stream.of(people)
//                .skip(2)
//                .forEach(System.out::println);

//        IntStream.of(new int[]{5,8,9,6,4,2,3,5})
//                .sorted()
//                .forEach(System.out::println);

        Stream.of(people)
                .peek(person -> System.out.println(person.getName()))
                .sorted(Comparator.comparing(Employee::getName)) // Demo, comparator komt in collections
                .limit(1)
                .forEach(System.out::println);

        Stream<Employee> peopleStream = Stream.of(people);
        DoubleStream salaryStream = peopleStream.mapToDouble(employee -> employee.getSalary());
        double sum = salaryStream.sum();
        System.out.println(sum);

        Stream<String> salaryStream2 = Stream.of(people)
                .map(employee -> employee.getName());

        Stream<Employee> jeans = IntStream.rangeClosed(1,10)
                .mapToObj(number -> jean);
    }
}
