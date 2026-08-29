/*
Problem: Build Array from Permutation
Platform: LeetCode
Topic: Arrays
Difficulty: Easy
Date: 29 August 2026

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
