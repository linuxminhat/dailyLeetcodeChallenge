package timeAndSpaceComplexity;

import java.util.Arrays;

class Solution {
	public static int[] moveZeroes(int[] nums) {
        int curIndex = 0;  
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }

        // Điền tất cả các vị trí còn lại bằng 0
        while (curIndex < nums.length) {
            nums[curIndex] = 0;
            curIndex++;
        }

        return nums;
    }
    public static void main(String[] args) {
    	int[] nums = {0, 1, 0, 3, 12};
        nums = moveZeroes(nums);  
        System.out.println(Arrays.toString(nums));
	}
}