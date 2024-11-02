package lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lamda {
    public static void main(String[] args) {
//        BinaryOperator<Integer> sum = (a, b) -> a * b;
//        System.out.println(sum.apply(1,2));
//
//
//        Runnable r = () -> System.out.println("Running in a thread");
//        new Thread(r).start();

        BiFunction<Integer, Double, Double> v = (Integer a, Double b) -> a * b;
        System.out.println(v.apply(5, 2.5));
        BinaryOperator<Integer> multiply = (a, b) -> {
            int result = a * b;
            System.out.println("Multiplying " + a + " and " + b + ": " + result);
            return result;
        };
        System.out.println(multiply.apply(4,5));
    }
}
