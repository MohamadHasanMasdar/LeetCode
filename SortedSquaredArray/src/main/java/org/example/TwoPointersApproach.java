package org.example;

public class TwoPointersApproach {

    public void solveWithTwoPointers(int[] inputArray) {

        int startIndex = 0;
        int endIndex = inputArray.length-1;

        int[] sortedSquaredArray = new int[inputArray.length];
        int resultArrayIndex = endIndex;

        while (startIndex <= endIndex) {
            if (Math.abs(inputArray[startIndex]) > Math.abs(inputArray[endIndex])) {
                sortedSquaredArray[resultArrayIndex] = inputArray[startIndex] * inputArray[startIndex];
                startIndex++;
            } else if (Math.abs(inputArray[startIndex]) <= Math.abs(inputArray[endIndex])) {
                sortedSquaredArray[resultArrayIndex] = inputArray[endIndex] * inputArray[endIndex];
                endIndex--;
            }

            resultArrayIndex--;
        }

        for (int i=0; i<sortedSquaredArray.length ; i++)
            System.out.println(sortedSquaredArray[i]);
    }
}
