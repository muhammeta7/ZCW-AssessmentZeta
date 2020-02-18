package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        /*int totalJumps= 0;

        if(j > k) {
            return k;
        }

        int minJumps = (int)Math.floor(k/j);
        while(totalJumps + (minJumps * j) < k) {
            totalJumps++;
        }

        totalJumps += minJumps;
        return totalJumps;*/

        return k % j + (k/j);

    }
}
