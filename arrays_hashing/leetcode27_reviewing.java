package arrays_hashing;

public class leetcode27_reviewing {
	/*
	 * Input: nums = [3,2,2,3], val = 3
	 * Output: 2, nums = [2,2,_,_]
	 */
	public int removeElement(int[] nums, int val) {
		int count=0;
		int n=nums.length;
        for(int i=0;i<n ;) {
        	if(nums[i]==val) {
        		for(int k=i;k<=n-2;k++) {
        			nums[k]=nums[k+1];//gán giá trị k bằng k+1
        			
        		}
        		n--;
        	}else {
        		++i;
        	}
        }
        return count;
    }

}
