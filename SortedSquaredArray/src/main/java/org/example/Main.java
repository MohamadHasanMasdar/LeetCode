package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {-3,-1,2,4};

//        new IterateAllArrayApproach().solveWithIterateAllArray(numbers);
        new TwoPointersApproach().solveWithTwoPointers(numbers);
    }
}