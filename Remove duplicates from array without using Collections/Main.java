package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] array = {1,1,2,2,3,4,5};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }

    public static int [] removeDuplicates( int [] array) {

        Arrays.sort(array);
        int [] newArray = new int[array.length]; //7 elements
        int counter = 0;

        for(int i = 0; i<array.length;i++) {
            boolean isDuplicate = false;

            for(int j = 0;j<array.length;j++) {
                if(array[i] == newArray[j]) {
                    isDuplicate = true;
                }
            }

            if(!isDuplicate) {
                newArray[counter] = array[i];
                counter++;
            }
        }
        int [] result = Arrays.copyOf(newArray,counter);
        return result;
    }
}
