package timeAndSpaceComplexity;

public class leetcode283_update1 {
	public static int[] moveZeroes(int[] nums) {
		int curIndex=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]!=0) {
        		nums[curIndex]=nums[i];
        		curIndex++;
        	} 
        }
        while(curIndex<nums.length) {
        	nums[curIndex]=0;
        	curIndex++;
        }
        return nums;
    }

}
