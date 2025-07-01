# TwoNumbersSum

there is a array of integer numbers and an integer number as target number.

purpose of this challenge is to find all of number pairs in the array that sum of them is equal to the target number.

i solve this challenge with 3 approaches.

1- first approach is using twoPointers. time complexity of this approach is O(N).

2- second approach is sortingApproach. first sort array by java's internal sorting algoritm. then put two pointers in first and last index of sorted array and iterate array to find number pairs. in this method, time complexity : sorting algoritm O(logN) - iterate O(N) -> so time complexity of this method is equal to O(NlogN).

3- in third approach i use an extra ArrayList. in this method we iterate numbersArray once and also iterate extra list just one time. so time complexity of this method is equal to O(N).
