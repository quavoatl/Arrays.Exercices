package com.example;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testThis = {1, 3, 5, 7, 8, 10};
        //largestAndSmaller(testThis);
        largestAndSmaller2(testThis);
    }

    public static void largestAndSmaller(int[] array) {
        Arrays.sort(array);
        int largest = array.length-1;
        System.out.println(array[0]);
        System.out.println(array[largest]);
    }

    public static void largestAndSmaller2(int[] array) {
        int smaller = Integer.MAX_VALUE; //  270000000
        int largest = Integer.MIN_VALUE; // -270000000

        // 1 3 5 6 7 8 10
        // 0 1 2 3 4 5 6

        for(int number : array) {
            if(number < smaller) {
                smaller = number;
            }else if( number > largest) {
                largest = number;
            }
        }
        System.out.println(smaller);
        System.out.println(largest);
    }
}
