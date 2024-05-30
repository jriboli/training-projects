package com.binaryNomad.problems;

public class ArraysNStrings_PrefixSum {

    /***
     * Prefix Sum ---
     * Formula:
     *      prefix[j] - prefix[i] + nums[i]
     *      prefix[j] - prefix[i -1]
     *
     * nums[] {3, 6, 2, 8, 1, 4, 1, 5}
     * pref[] {3, 9, 11, 19, 20, 24, 25, 30}
     *
     * How to build the prefix array
     * prefix = [nums[0]]
     * for (int i = 1; i < nums.length; i++)
     *      prefix.append(nums[i] + prefix[prefix.length-1])
     */

    /*
     * Example 1: Given an integer array nums, an array queries where queries[i] = [x,y]
     * and an integer limit, return a boolean aray that represents the answer to each query.
     *
     * nums = [1, 6, 3, 2, 7, 2]
     * queries = [[0,3], [2,5], [2,4]]
     */

    public static boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // We have already populated position 0 and we are starting at 1
            // The prefix[i-1] is the current sum of all numbers before it
            prefix[i] = prefix[i -1] + nums[i];
        }

        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];
            int curr = prefix[y] - prefix[x] + nums[x];
            ans[i] = curr < limit;
            System.out.println("ANSWER: " + ans[i]);
        }

        return ans;
    }

    /*
     * Example 2: 2270. Number of Ways to Split Array
     *
     * Given an integer array nums, find the number of ways to split the array into two parts so that the
     * first section has a sum greater than or equal to the sum of the second section.
     */
    public static int waysToSplitArray(int[] nums) {
        
    }
}
