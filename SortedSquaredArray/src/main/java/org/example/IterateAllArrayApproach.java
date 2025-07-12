package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateAllArrayApproach {

    public void solveWithIterateAllArray(int[] inputArray) {
        int[] sortedSquaredArray = new int[inputArray.length];
        for (int i=0; i<inputArray.length ; i++) {
            sortedSquaredArray[i] = inputArray[i] * inputArray[i];
        }

        Arrays.sort(sortedSquaredArray);
        for (int i=0; i<sortedSquaredArray.length ; i++) {
            System.out.println(sortedSquaredArray[i]);
        }
    }
}
