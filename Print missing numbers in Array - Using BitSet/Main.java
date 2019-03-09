package com.example;


import java.util.BitSet;

public class Main {

    public static void main(String[] args) {
    int[] testThis = {1,3,5,7,8,10};
        checkNumbers(testThis,10);

    }


    public static void checkNumbers(int[] array,int totalSize) {
        int totalMissingNumbers = totalSize - array.length;
        BitSet bitSet = new BitSet(totalSize);
        // 1   3   5   7 8   10
        // 0 0 0 0 0 0 0 0 0 0
        // first loop i = 1 // add in bitset at index i-1(0)
        // 1 0 0 0 0 0 0 0 0 0
        // second loop i = 3// add in bitset at index i-1(2)
        // 1 0 1 0 0 0 0 0 0 0
        //....................
        // 1 0 1 0 1 0 1 1 0 10

        // 0 1 2 3 4 5 6 7 8 9


        for (int i : array) {
            bitSet.set(i - 1);
        }

        int lastNumberMissing = 0;
        for (int j = 0; j < totalMissingNumbers; j++) {
            lastNumberMissing = bitSet.nextClearBit(lastNumberMissing);
            //nextClearBit returns the index of the next 0 in bitset

            lastNumberMissing++;
            System.out.println("Found missing number : " + lastNumberMissing);
        }
    }
}
