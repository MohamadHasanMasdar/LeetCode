package org.example;

public class PointersIterateApproach {

    public boolean solveWithPointersApproach(int[] mainSequence, int[] subSequence) {
        int subCounter=0;
        int mainCounter=0;
        while (subCounter < subSequence.length) {
            boolean isSubSequence=false;
            for (int i=mainCounter ; i<mainSequence.length; i++) {
                if (mainSequence[i] == subSequence[subCounter]) {
                    mainCounter = i;
                    isSubSequence = true;
                    break;
                }
            }

            if (!isSubSequence)
                return false;

            subCounter++;
        }

        return true;
    }
}
