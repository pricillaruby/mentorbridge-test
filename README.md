# Stream API Test - 03/03/2026

# Description
1. Find the second highest number from the given list.
Input: 10 45 67 23 89 54 89
    
2. Find First Non-Repeated Number.Find the first number that appears only once in the list.
Input: 4 5 1 2 0 4 5 2
 
3. Print all duplicate numbers from the list.
Input: 10 20 30 20 40 10 50 30
 
4. Count how many times each number appears.
Input: 1 2 3 2 4 1 5 1

5. Find the top 3 highest numbers.
Input: 10 80 45 60 30 90 20
 
6. Partition the numbers into even and odd groups.
Input: 10 15 20 25 30 35 40
 
7. Find numbers whose first digit is 1.
Input: 10 15 23 11 45 19 30

8. Find common numbers between two lists.
Input:
List1: 10 20 30 40 50
List2: 30 40 60 70
 
9. Group numbers into even and odd using grouping.
Input:
5 10 15 20 25 35
 
10. Find the sum of squares of even numbers.
Input: 1 2 3 4 5 6

# Technology used
- Java 21
- Stream API
- Collections

# Functionality 
1. First we need to make the elements unique , use distinct() . And sort in reverseOrder using reverseOrder() , then skip the first element using skip() and finally to get second highest use findFirst().
2. To find the first non-repeated number using frequency of the number is equal to one and using findFirst() we can get the answer.
3. using frequency() , we can get all duplicate numbers.
4. To know how many times the number appears , use groupingBy() and counting().
5. To know top 3 numbers , sort in reverse order using reverseOrder() and to get first three , use limit(3).
6. Group the numbers into even or odd , using groupingBy() and Map.
7. To get the numbers start with digit 1 , use startsWith("1").
8. To know common numbers between two list , use contains.
9. Group the numbers into even or odd , using groupingBy() and Map.
10. First to get even number use filter() and to make the squares of even number use map() then to sum the squares of even numbers , use reduce().
