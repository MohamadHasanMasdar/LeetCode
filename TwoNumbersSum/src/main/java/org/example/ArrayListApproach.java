package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApproach {

    // we want to find two numbers that sum of them is equal to target. so we have x+y=target -> y=target-x
    // y is number in the extraList. x is number in numbersArray
    public void resolveWithExtraArrayList(int[] numbersArray, int target) {

        System.out.println("selected approach is ArrayListApproach");
        List<Integer> list = new ArrayList<>();
        int counter=0;
        while (counter < numbersArray.length) {
            int y = target - numbersArray[counter];
            if (list.stream().filter(x -> x == y).findAny().isPresent())
                System.out.println("two numbers are " + y + " , " + numbersArray[counter]);
            else
                list.add(numbersArray[counter]);

            counter++;
        }
    }
}
