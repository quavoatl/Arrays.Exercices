package com.example;


public class Main {

    public static void main(String[] args) {
        int[] testThis = {1, 3, 5, 7, 8, 10};
        binarySearch(testThis,3);

    }

    public static boolean binarySearch(int[] array, int numToFind) {
        int low = 0;
        int high = array.length;
        // 1 3 5 7 8 9
        // 0 1 2 3 4 5

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = array[mid];

            if (midValue < numToFind) {
                low = mid + 1;
            } else if (midValue > numToFind) {
                high = mid - 1;
            } else {
                System.out.println("Found number : " + numToFind);
                return true;
            }
        }
        System.out.println("No such number could be found");
        return false;
    }

}
