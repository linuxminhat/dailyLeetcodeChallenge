package arrays_hashing;

public class leetcock {
	class Solution {
	    public int findDuplicate(int[] nums) {
	        int repeated_numb=0;
			for(int i=1;i<nums.length;i++) {
				for(int j=0;j<i;j++) {
					if(nums[i]==nums[j]) {
						repeated_numb=nums[i];
					}
				}
			}
			return repeated_numb;

	    }
	}
}
