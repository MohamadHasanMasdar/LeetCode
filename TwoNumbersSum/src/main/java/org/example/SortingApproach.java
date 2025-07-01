package org.example;

import java.util.Arrays;

public class SortingApproach {

    public void resolveWithSortArray(int[] numbersArray, int target) {

        System.out.println("selected approach is SortingApproach");
        Arrays.sort(numbersArray);
        int leftPointer=0;
        int rightPointer=numbersArray.length-1;

        while (leftPointer < rightPointer) {
            if (numbersArray[leftPointer] + numbersArray[rightPointer] == target) {
                System.out.println("two numbers are " + numbersArray[leftPointer] + " , " + numbersArray[rightPointer]);
                leftPointer++;
                rightPointer--;
            }

            else if (numbersArray[leftPointer] + numbersArray[rightPointer] < target)
                leftPointer++;

            else if (numbersArray[leftPointer] + numbersArray[rightPointer] > target)
                rightPointer--;
        }
    }
}
