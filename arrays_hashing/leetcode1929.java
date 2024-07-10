package arrays_hashing;

import java.util.Arrays;

public class leetcode1929 {
	public static int[] nums = {1,3,2,1};
	// 1 3 2 1 1 3 2 1
	// 0 1 2 3 4 5 6 7 
	    public static int[] getConcatenation(int[] nums) {
	        int[] newArray= new int[(nums.length)*2]; 
	        for(int i=0;i<nums.length;i++) 
	        	//nums.length = 4
	        {
	        	newArray[i]=nums[i];
	        	newArray[i+nums.length]=newArray[i];
	        }
	        return newArray;
	    }
	    public static void main(String[] args) {
	    	System.out.println(Arrays.toString(getConcatenation(nums)));
			
		}
}
