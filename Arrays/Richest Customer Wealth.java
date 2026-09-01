
/*
Problem: Richest Customer Wealth
Platform: LeetCode
Topic: Arrays
Difficulty: Easy
Date: 01 september 2026

Time Complexity: O(n x m)
Space Complexity: O(n)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int [] result=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            result[i]=sum;
        }
        int largest=result[0];
        for(int i=0;i<result.length;i++){
            if(result[i]>largest){
                largest=result[i];
            }
        }
        return largest;
    }
}
