// QUESTION: Maximum Consecutive Ones

// Problem Statement:
// Given a binary array `nums` containing only `0`s and `1`s, find the maximum number of consecutive `1`s in the array.
// Your task is to return the length of the longest continuous sequence of `1`s.

// Input: An integer array `nums` consisting only of `0` and `1`.

// Output: Return an integer representing the maximum number of consecutive `1`s.


// Example 1

// Input:
// `nums = [1,1,0,1,1,1]`

// Output:
// `3`

// Explanation:
// The first sequence of `1`s has length `2`, and the second sequence has length `3`.
// The maximum consecutive `1`s is `3`.

// Example 2

// Input:
// nums = [1,0,1,1,0,1]

// Output: 2

// Explanation: The longest continuous sequence of `1`s is `[1,1]`, which has length `2`.


// Constraints:
// 1. `1 ≤ nums.length ≤ 10^5`
// 2. `nums[i]` is either `0` or `1`

import java.util.*;
class solution{
    public int find_Max(int[] nums){
        int count = 0 , max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(max,count);

    }
}

public class maximum_consecutive_ones{
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter Size of  Array: ");
        int n = src.nextInt();

        int[] nums =new int[n];

        System.out.println("Enter your element(0 or 1): ");
        for(int i=0;i< n;i++){
            nums[i]=src.nextInt();
        }
        solution obj = new solution();
        int result = obj.find_Max(nums);

        System.out.println("Maximum Consecutive Ones : " + result);

        src.close();
    }
}