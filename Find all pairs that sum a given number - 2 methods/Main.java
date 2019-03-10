package com.example;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] testThis = {1, 2, 9, 3, 7, 8, 6};

        findPairs(testThis, 9);

        findPairs2(testThis, 10);

    }

    public static void findPairs(int[] array, int sumToFind) {
        if (array.length < 2) {
            return;
        }

        Set<Integer> set = new HashSet<>(array.length);

        for (int value : array) {
            int target = sumToFind - value;

            if (!set.contains(value)) {
                set.add(target);
            } else {
                System.out.println("Found pair : " + value + "," + target);

            }
        }


    }

    public static void findPairs2(int[] array, int sumToFind) {
        if (array.length < 2) {
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }
        Arrays.sort(array);

        for (int j = 0; j < array.length; j++) {
            int target = sumToFind - array[j];

            if (map.containsKey(target) && binarySearch(array, target)) {
                int totalToAdd = target;
                System.out.println("Found pair to sum " + sumToFind);
                System.out.println("{" + array[j] + "," + totalToAdd + "}");
            }
        }
    }


    public static boolean binarySearch(int[] array, int numToFind) {
        int low = 0;
        int high = array.length;

        while (low <= high) {

            int mid = (low + high) / 2;
            int midValue = array[mid];

            if (midValue < numToFind) {
                low = mid + 1;
            } else if (midValue > numToFind) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
