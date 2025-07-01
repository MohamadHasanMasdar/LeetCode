package org.example;


import org.example.enums.ApproachType;

public class Main {

    private static int target = 10;
    private static int[] numbersArray = {3,5,-4,8,11,1,-1,6};

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        chooseResolveMethod(ApproachType.TwoPointersApproach);
    }

    private static void chooseResolveMethod(ApproachType approachType) {
        if (approachType == ApproachType.TwoPointersApproach)
            new TwoPointersApproach().resolveWithTwoPointers(numbersArray, target);
        else if (approachType == ApproachType.SortingApproach)
            new SortingApproach().resolveWithSortArray(numbersArray, target);
        else if (approachType == ApproachType.ArrayListApproach)
            new ArrayListApproach().resolveWithExtraArrayList(numbersArray, target);
    }
}