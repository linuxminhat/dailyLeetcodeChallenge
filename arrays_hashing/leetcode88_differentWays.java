package arrays_hashing;
import java.util.Arrays;//nums1 = [1,2,3,0,0,0]->m=3; nums2 = [2,5,6]->n=3 => [1,2,2,3,5,6]
public class leetcode88_differentWays {
	public static int[] nums1 = {1,2,3};
	public static int[] nums2 = {2,5,6};
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		//create a copy version of nums1
		int k=m+n;
		int[] nums1_copy=new int[k];
		for(int i=0;i<nums1.length;i++) {
			nums1_copy[i]=nums1[i];//copy 
		}
		int nums1_maxValue=nums1[nums1.length-1];//assume
		int nums2_maxValue=nums2[nums2.length-1];//assume
		for(int i=nums1.length-1;i>0;) {
			if(nums1[i-1]>nums1[i]) {
				nums1_maxValue=nums1[i-1];
				i--;
			}
			for(int j=nums2.length-1;j>0;) {
				if(nums2[j-1]>nums2[j]) {
					nums2_maxValue=nums2[j-1];
					j--;
				}
			}
			if(nums1_maxValue>nums2_maxValue) {
				nums1_copy[k-1]=nums1_maxValue;//fill to the last 
				k--;
			}else {
				nums1_copy[k-1]=nums2_maxValue;
				k--;
			}
		}
//		if(nums1_maxValue>nums2_maxValue) {
//			nums1_copy[k-1]=nums1_maxValue;//fill to the last 
//		}else {
//			nums1_copy[k-1]=nums2_maxValue;
//		}
//		k--;
		System.out.println(Arrays.toString(nums1_copy));
    }
	public static void main(String[] args) {
		merge(nums1,3,nums2,3);
	}
}
