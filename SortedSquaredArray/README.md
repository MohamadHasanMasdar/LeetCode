# SortedSquaredArray

there is a sorted array of integer numbers (they may be positive or negative numbers).

we want to square each number in the array and put them to a new array in the sorted order.

example1: [1,2,3,4] -> [1,4,9,16]     
example2:          [-3,-1,2,4] -> [1,4,9,16]

if all numbers are positive then everything is ok and square of them would be in sorted order. but the challenge is when some numbers are negative and some are positive. in this situation, sqaure of the numbers will not be in a sorted order.

i solve this challenge with 2 approaches:
1- iterateAllArray approach: this approach is not optimal in time complexity and space complexity.  time complexity is O(NlogN) and space complexity is O(N).

2- TwoPointes approach: this approach is optimal in time complexity because does not any extra sort method. result array will generate in a sorted order. time complexity is O(N) and space complexity is O(N).

