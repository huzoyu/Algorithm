package leetcode;

import java.util.Arrays;

/**
 *
 * 16. 3Sum Closest
 *
 * Given an array nums of n integers and an integer target, find three integers in nums such
 * that the sum is closest to target. Return the sum of the three integers. You may assume
 * that each input would have exactly one solution.
 *
 * Example:
 *
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 */

public class Code016 {

    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int temp = target - nums[i];
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int diff =   nums[low]+nums[high]-temp;
                if(diff == 0) return target;
                if(Math.abs(min) > Math.abs(diff)){
                    min = diff;
                }
                if(diff > 0)high--;
                else low++;

            }
        }

        return target+min;
    }
}
