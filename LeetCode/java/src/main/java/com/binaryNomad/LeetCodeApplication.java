package com.binaryNomad;

import com.binaryNomad.problems.ArraysNStrings_TwoPointers;

import java.util.Arrays;

public class LeetCodeApplication {
    public static void main(String[] args) {

        //System.out.println(ArraysNStrings_TwoPointers.checkForTargetOofNsquared(new int[]{1, 2, 4, 6, 8, 9, 14, 15}, 14));
        //System.out.println(ArraysNStrings_TwoPointers.checkForTargetOofN(new int[]{1, 2, 4, 6, 8, 9, 14, 15}, 14));

        // Arrays N Strings - Two Pointers
        // Problem 1
        System.out.println(ArraysNStrings_TwoPointers.reverseString(new char[]{'h','e','l','l','o'}));
        System.out.println(ArraysNStrings_TwoPointers.reverseString(new char[]{'H','a','n','n','a','h'}));

        // Problem 2
        Arrays.stream(ArraysNStrings_TwoPointers.sortedSquares(new int[]{-7, -3, 2, 3, 11}))
                .forEach(i -> System.out.println(i));
        Arrays.stream(ArraysNStrings_TwoPointers.sortedSquares(new int[]{-5, -3, -2, -1}))
                .forEach(i -> System.out.println(i));
    }
}