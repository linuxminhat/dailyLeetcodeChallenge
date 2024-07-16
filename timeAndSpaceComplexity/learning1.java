package timeAndSpaceComplexity;

import java.util.Arrays;

public class learning1 {
	public static int[] nums = {0,1,0,3,12};
	public static String moveZeroes(int[] nums) {
		int n = nums.length;
		int[] newArray = new int[n];
		for(int iNew =0;iNew<n;iNew++) {
			if(nums[iNew]!=0){
				newArray[iNew++]=nums[iNew];
			}
		}
		return Arrays.toString(newArray);
	}
	public static void main(String[] args) {
		System.out.println(moveZeroes(nums));
	}
}
