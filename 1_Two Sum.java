/*Problem NO.1
 * Given an array of integers, 
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 */

package test;

import java.util.Scanner;

public class Test {
	
	public static int[] twoSum(int[] nums, int target) {
        int[] res = {0,0} ;
        int tmp = 0;
        for (int i=0;i<nums.length;i++) {
        	tmp = nums[i];
        	for (int j = i+1;j<nums.length;j++) {
        		if (tmp + nums[j] == target) {
        			res[0] = i; res[1] = j;
        			return res;
        		}
        	}
        }
        return res;
    }
	public static void main(String args[]) {
		int[] nums = {4,7,5,10};
		int target = 9;
		int[] res = twoSum(nums,target);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	
}
