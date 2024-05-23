package com.binaryNomad.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysNStrings_TwoPointers {

    /*
     * Example 1: Given a string s, return true if it is a palindrome, false otherwise
     */
    public boolean checkIfPalindrome(String s) {
        /***
         * Algorithm runs in O(n) time, and only needs O(1) space.
         *
         * The O(n) because the while loop iterates over the string, the longer the string
         * the more loops or steps executed.
         */
        int left = 0;
        int right = s.length() -1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    /*
     * Example 2: Given a sorted array of uniqu integers and a target integer, return ture if there
     * exists a pair of numbers that sum to target, false otherwise.
     */
    public static boolean checkForTargetOofNsquared(int[] nums, int target) {
        /***
         * Algorithm is O(n^2)
         *
         * We are looping through te array, then in the inner loop we are doing it again
         * so O(n * n)
         */
        for(int i : nums) {
            for(int j : nums) {
                if(i == j)
                    continue;

                if(i + j == target)
                    return true;
            }
        }

        return false;
    }

    public static boolean checkForTargetOofN(int[] nums, int target) {
        /***
         * ALgorithm is O(n)
         *
         * As we are only iterating over the array once, and each step moves
         */
        int left = 0;
        int right = nums.length -1;

        while (left < right) {
            int curr = nums[left] + nums[right];
            if(curr == target)
                return true;


            if (curr > target)
                right--;
            else
                left++;
        }

        return false;
    }

    /*
     * Example 3: Given two sorted integer arrays arr1 and arr2, return a new arry that combines both of them and
     * is also sorted
     */
    public List<Integer> combine(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i< arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            ans.add(arr1[j]);
            j++;
        }

        return ans;
    }

    /*
     * Example 4: Given two string s and t, return true is s if a subsequence of t, or false otherwise.
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    /*
     * Problem 1: Write a function that reverses a string. The input string is given as an array of characters s.
     * You must do this by modifying the input array 'in-place' with O(1) for space complexity
     */
    public static char[] reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;

        while(first < last) {
            char tempLast = s[last];
            s[last] = s[first];
            s[first] = tempLast;

            first++;
            last--;
        }

        return s;
    }

    /*
     * Problem 2: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted
     * in non-decreasing order
     */
    public static int[] sortedSquares(int[] nums) {
        int firstPositive = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0 && firstPositive == 0)
                firstPositive = i;
            nums[i] = nums[i] * nums[i];
        }

        int[] results = new int[nums.length];
        int i = 0;
        int j = firstPositive;
        System.out.println("First Positive: " + j);
        while (i < nums.length) {
            if(i == 0) {
                results[i] = nums[j];
            } else if(nums[j-i] <= nums[j+i]) {
                results[i] = nums[j - i];
                results[i+1] = nums[j + i];
            } else {
                results[i] = nums[j + i];
                results[i+1] = nums[j - i];
            }
            i += 2;
            Arrays.stream(results).forEach(System.out::println);
            System.out.println("-----------");
        }

        return nums;
    }
}
