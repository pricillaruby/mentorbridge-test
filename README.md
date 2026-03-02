
# Stream API Test 

# Description
The test contains the following questions:
 1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions ?
    10,15,8,49,25,98,32
 2. How to find duplicate elements in a given integers list in java using Stream functions?
    10,15,8,49,25,98,98,32,15
 3. Given a list of integers, sort all the values present in it in descending order using Stream functions?
    10,15,8,49,25,98,98,32,15
 4. How to find only duplicate elements with its count from the String ArrayList in Java8?
    [“AA", "BB", "AA", "CC”]
 5. Mapping
    Question: Given a list of strings representing names, map each name to its length and collect the lengths into a new list.
       - Input: ["John", "Alice", "Bob"]
       - Expected Output: [4, 5, 3]
 6. Distinct Elements:
    Question: Given a list of integers with duplicates, remove duplicates and collect the unique elements into a new list.
      - Input: [1, 2, 2, 3, 4, 4, 4, 5]
      - Expected Output: [1, 2, 3, 4, 5]
These can be solved using Stream API

# Technology used
- Java 21
- Stream API
- Collections

# Functionality
 1. To find even numbers ,filter() is used . Here , we can pass number % 2 == 0 condition inside filter().
 2. To find duplicate elements , frequency() is used . Here , we can see the number of times particular number exists using frequency().
 3. To order in descending , sorted() and reverseOrder() is used.
 4. To find duplicate elements and count , store it in map then groupingBy() and counting() is used.
 5. To find length of each names in list and store it in a list , length() is used.
 6. To find unique elements , distinct() is used. This method only takes unique elements , removes duplicates.
