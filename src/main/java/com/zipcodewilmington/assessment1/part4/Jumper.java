package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int totalJumps= 0;

        // Test Case 3
        if(j > k) {
            return k;
        }

        // Minimum of jumps before going past flag
        int minJumps = (int)Math.floor(k/j);

        // totalJump increments while sum of both types of jumps are less than height
        while(totalJumps + (minJumps * j) < k) {
            totalJumps++;
        }

        // Sum both after incrementing
        totalJumps += minJumps;

        return totalJumps;

    }
}
