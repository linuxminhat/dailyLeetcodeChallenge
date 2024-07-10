//package arrays_hashing;
//
//import java.util.Arrays;
//
//public class leetcode88 {
//	/*
//	 * 88. Merge Sorted Array
//	 */
//	/*
//	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//       Output: [1,2,2,3,5,6]
//       Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//       The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//	 */
//	static int[] nums1 = {1,2,3};
//	static int[] nums2 = {2,5,6};
//	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//		int[] mergeArray = new int[m+n];//6 
//		for(int i=0;i<nums1.length;i++) {
//			mergeArray[i]=nums1[i];
//		}
//		for(int j=0;j<nums2.length;j++) {
//			int mergeArray_index=mergeArray.length-nums1.length;
//			mergeArray[mergeArray_index]=nums2[j];
//			mergeArray_index++;
//		}
//		//Ham duoi day tam thoi khong hoat dong 
//		for(int i=0;i<mergeArray.length-1;i++) {
//			for(int j=i+1;j<mergeArray.length;j++) {
//				if(mergeArray[j]>mergeArray[i]) {
//					swap(mergeArray[i],mergeArray[j]);
//				}
//			}
//		}
//		System.out.println(Arrays.toString(mergeArray));
//    }
//
//	private static void swap(int i, int j) {
//		int temp=0;
//		if(i>=j) {
//			temp=i;
//			i=j;
//			j=temp;
//		}
//		
//	}
//	public static void main(String[] args) {
//		merge(nums1,3,nums2,3);
//	}
//
//}
