package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] mainSequence = {5,1,22,25,6,-1,8,10};
        int[] subSequence = {1,6,-1,10};

        boolean isSubsequence = new PointersIterateApproach().solveWithPointersApproach(mainSequence, subSequence);
        System.out.println("isSubsequence: " + isSubsequence);
    }
}