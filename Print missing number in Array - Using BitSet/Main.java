package com.example;

import java.util.BitSet;

public class Main {

    public static void main(String[] args) {
    int [] array = {1,3,5,6,7};
    printMissingNumbers(array,7);

    }

    public static void printMissingNumbers(int [] array, int totalSize) {
        int totalMissingNumbers = totalSize - array.length;
        BitSet bitset = new BitSet(totalSize);

        for(int number : array) {
            bitset.set(number-1);
        }

        int lastMissingNumberIndex = 0;
        for(int i = 0; i < totalMissingNumbers;i++) {
            lastMissingNumberIndex = bitset.nextClearBit(lastMissingNumberIndex);
            lastMissingNumberIndex++;
            System.out.println("Found missing number in your array : " + lastMissingNumberIndex);
        }

    }
}
