package arrays_hashing;

import java.util.Arrays;

public class leetcode88_diffwayUpdating {
	public  void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;//Duyet nums1
		int j=n-1;//Duyet nums2
		int k=(m+n)-1;//Duyet big nums1[]
		while(k>=0) {
			if(j<0) {
				nums1[k]=nums1[i];
				i--;
			}else if(i<0) {
					nums1[k]=nums2[j];
					j--;
				}else if(nums1[i]>nums2[j]){
						nums1[k]=nums1[i];
						i--;
					}else {
//						if(nums2[j]>nums1[i]){
							nums1[k]=nums2[j];
							j--;
					}
			k--;
      }
   }
}
