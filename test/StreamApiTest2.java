package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiTest2 {
    public static void main(String[] args) {
        System.out.println("Second Highest Number");
        List<Integer> list = Arrays.asList(10,45,67,23,89,54,89);
        System.out.println(list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(0));

        System.out.println("First Non-Repeated number");
        List<Integer> numbers = Arrays.asList(4,5,1,2,0,4,5,2);
        System.out.println(numbers.stream()
                .filter(n-> Collections.frequency(numbers , n) == 1)
                .findFirst().orElse(0));

        System.out.println("Finding duplicate numbers");
        List<Integer> numbersList = Arrays.asList(10,20,30,20,40,10,50,30);
        numbersList.stream()
                .filter(duplicates-> Collections.frequency(numbersList , duplicates) > 1)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Frequency of each numbers");
        Map<Integer , Long> frequencyOfNumber = numbersList.stream()
                .collect(Collectors.groupingBy(number -> number , Collectors.counting()));
        System.out.println(frequencyOfNumber);

        System.out.println("Top 3 highest numbers");
        List<Integer> listOfNumbers = Arrays.asList(10 ,80 ,45 ,60 ,30 ,90 ,20);
        listOfNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Partitioning number into even and odd");
        List<Integer> number = Arrays.asList(10 ,15 ,20 ,25 ,30 ,35 ,40);
        Map<Boolean , List<Integer>> evenOrOdd = number.stream()
                .collect(Collectors.partitioningBy(even ->  even % 2 == 0));

        System.out.println("Even: "+ evenOrOdd.get(true));
        System.out.println("Odd: " + evenOrOdd.get(false) );

        System.out.println("Number starts with digit 1");
        List<Integer> numberStarts = Arrays.asList(10,15,23,11,45,19,30);
        numberStarts.stream().map(String::valueOf)
                .filter( numbersWithOne -> numbersWithOne.startsWith("1"))
                .forEach(System.out::println);

        System.out.println("Common Elements between two lists");
        List<Integer> list1 = Arrays.asList(10, 20 ,30 ,40 ,50);
        List<Integer> list2 = Arrays.asList(30 ,40 ,60,70);
        list1.stream().filter(list2::contains).forEach(System.out::println);

        System.out.println("Grouping numbers into even and odd");
        Map<Boolean , List<Integer>> groupedNumbers = number.stream()
                .collect(Collectors.partitioningBy(n ->  n % 2 == 0));

        System.out.println("Even: "+ groupedNumbers.get(true));
        System.out.println("Odd: " + groupedNumbers.get(false) );

        System.out.println("Sum of Squares of even number ");
        List<Integer> numberLists = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numberLists.stream()
                .filter( integer -> integer % 2 == 0)
                .mapToInt(num-> num*num)
                .sum());
    }
}
