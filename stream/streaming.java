package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streaming {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "Jake");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);

        Stream<Integer> data = nums.stream();
//        data.forEach(n -> System.out.println(n));
        //only one we can use stream
//        data.forEach(n -> System.out.println(n));

//        long count = data.count();
//        System.out.println(count);
//        data.forEach(n -> System.out.println(n));

//        Stream<Integer> sorteddata = data.sorted();
//        sorteddata.forEach(n -> System.out.println(n));

//        Stream<Integer> mappeddata = data.map(n -> n*2);
//        mappeddata.forEach(n -> System.out.println(n));

//        nums.stream()
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));
//        nums.stream()
//                .filter(n -> n%2==1)
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));

        int sum = nums.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .reduce(2,(c,e) -> c+e);
        System.out.println(sum);
    }
}
