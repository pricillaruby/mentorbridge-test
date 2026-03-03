package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiTest {
      public static void main(String[] args) {
        System.out.println("Second Highest Number");
        List<Integer> numbers = Arrays.asList(10,45,67,23,89,54,89);
        Integer secondHighestNumber = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(secondHighestNumber);

        System.out.println("First Non-Repeated number");
        List<Integer> listOfNumbers = Arrays.asList(4,5,1,2,0,4,5,2);
        Integer nonRepeatedNumber = listOfNumbers.stream()
                .filter(number->Collections.frequency(listOfNumbers,number) == 1)
                .findFirst()
                .orElse(null);

        System.out.println(nonRepeatedNumber);

        System.out.println("Finding duplicate numbers");
        List<Integer> list = Arrays.asList(10,20,30,20,40,10,50,30);
        List<Integer> duplicateNumbers = list.stream()
                .filter(number2 -> Collections.frequency(list,number2) > 1)
                .distinct()
                .toList();

        System.out.println(duplicateNumbers);

        System.out.println("Frequency of each numbers");
        List<Integer> repeatedNumbers = Arrays.asList(1,2,3,2,4,1,5,1);
        Map<Integer,Long> frequencyOfNumbers = repeatedNumbers.stream()
                .collect(Collectors.groupingBy(number->number , Collectors.counting()));

        System.out.println(frequencyOfNumbers);

        System.out.println("Top 3 highest numbers");
        List<Integer> numbersList = Arrays.asList(10 ,80 ,45 ,60 ,30 ,90 ,20);
        List<Integer> topThreeNumbers = numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(topThreeNumbers);

        System.out.println("Partitioning number into even and odd");
        List<Integer> number = Arrays.asList(10 ,15 ,20 ,25 ,30 ,35 ,40);
        Map<Boolean,List<Integer>> partitionedNumber = number.stream()
                .collect(Collectors.partitioningBy(num->num%2 ==0));

        System.out.println("Even: "+partitionedNumber.get(true));
        System.out.println("Odd: "+partitionedNumber.get(false));

        System.out.println("Number starts with digit 1");
        List<Integer> numList = Arrays.asList(10,15,23,11,45,19,30);
        numList.stream()
              .map(String::valueOf)
              .filter(n->n.startsWith("1"))
              .forEach(System.out::println);

        System.out.println("Common Elements between two lists");
        List<Integer> list1 = Arrays.asList(10, 20 ,30 ,40 ,50);
        List<Integer> list2 = Arrays.asList(30 ,40 ,60,70);
        List<Integer> matchingNumbers = list1.stream()
                  .filter(list2::contains)
                  .toList();

        System.out.println(matchingNumbers);

        System.out.println("Grouping numbers into even and odd");
        List<Integer> number2 = Arrays.asList(5 ,10, 15, 20, 25, 30);
        Map<Boolean,List<Integer>> groupingNumber = number.stream()
                .collect(Collectors.partitioningBy(num1->num1 %2 ==0));

        System.out.println("Even: "+partitionedNumber.get(true));
        System.out.println("Odd: "+partitionedNumber.get(false));

        System.out.println("Sum of Squares of even number ");
        List<Integer> numberList1 = Arrays.asList(1,2,3,4,5,6);
        Integer sumOfSquaresOfEvenNumber = numberList1.stream()
                .filter( number1 -> number1 % 2 == 0)
                .map(n->n*n)
                .reduce(0,Integer::sum);

        System.out.println(sumOfSquaresOfEvenNumber);
    }
}
