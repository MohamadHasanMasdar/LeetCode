package org.example;

import java.math.BigInteger;

public class TwoPointersApproach {

    public void resolveWithTwoPointers(int[] numbersArray, int target) {

        System.out.println("selected approach is TwoPointersApproach");
        for (int i = 0; i<numbersArray.length-1; i++) {
            for (int j=i+1; j<numbersArray.length; j++) {
                if (numbersArray[i] + numbersArray[j] == target)
                    System.out.println("two numbers are " + numbersArray[i] + " , " + numbersArray[j]);
            }
        }
    }
}
