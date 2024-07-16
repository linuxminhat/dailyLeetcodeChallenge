package timeAndSpaceComplexity;

import java.util.Arrays;

public class leetcode283_review {
	public static int[] moveZeroes(int[] nums) {
        int curIndex=0;
        for(int index=0;index<nums.length;index++) {
        	while(curIndex<index) {
        	if(nums[index]!=0) {
        		nums[curIndex]=nums[index];
        	}else {
        		for(curIndex = curIndex+1;curIndex<nums.length;curIndex++) {
        			nums[curIndex]=0;
        		}
        	}
        }
      }
        return nums;
    }
	public static void main(String[] args) {
		 int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(moveZeroes(nums)));
	}

}
