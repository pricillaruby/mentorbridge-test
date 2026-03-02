package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//      1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions ?
//        10,15,8,49,25,98,32
        System.out.println("Finding all Even numbers");
        List<Integer> listOfNumbers = Arrays.asList(10,15,8,49,25,98,32);
        listOfNumbers.stream().filter(number-> number % 2 == 0).forEach(System.out::println);

//      2. How to find duplicate elements in a given integers list in java using Stream functions?
//         10,15,8,49,25,98,98,32,15
        System.out.println("Finding duplicate elements");
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> duplicateNumbers = numbers.stream()
                .filter(number-> Collections.frequency(numbers,number) > 1)
                .distinct()
                .toList();

        System.out.println(duplicateNumbers);

//      3. Given a list of integers, sort all the values present in it in descending order using Stream functions?
//         10,15,8,49,25,98,98,32,15
        System.out.println("Sorting in descending order");
        List<Integer> reverseOrder = listOfNumbers.stream()
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println(reverseOrder);

//       4. How to find only duplicate elements with its count from the String ArrayList in Java8?
//          [“AA", "BB", "AA", "CC”]
        System.out.println("Finding Duplicate elements with its count");
        List<String> values = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String,Long> duplicatesWithCount = values.stream()
                .collect(Collectors.groupingBy(letter->letter,Collectors.counting()));

        System.out.println(duplicatesWithCount);

//      5.Mapping
//        Question: Given a list of strings representing names, map each name to its length and collect the lengths into a new list.
//                Input: ["John", "Alice", "Bob"]
//        Expected Output: [4, 5, 3]
        System.out.println("Listing length of names");
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<Integer> lengthOfNames = names.stream()
                .map(String::length)
                .toList();

        System.out.println(lengthOfNames);

//      6. Distinct Elements:
//         Question: Given a list of integers with duplicates, remove duplicates and collect the unique elements into a new list.
//         Input: [1, 2, 2, 3, 4, 4, 4, 5]
        System.out.println("List of Unique Elements");
        List<Integer> numbersList = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);

        List<Integer> distinctNumbers = numbersList.stream()
                .distinct()
                .toList();

        System.out.println(distinctNumbers);
    }
}
