package advanced_Sorting;

import java.util.Arrays;

public class mergeSort_learning2 {
	public int[] merge(int[]a1, int[] a2) {
		 int n = a1.length + a2.length;
		    int[] result = new int[n];
		    //i for result[] array 
		    //i1 for a1[] array
		    //i2 for a2[] array 
		    int i = 0;
		    int i1 = 0;
		    int i2 = 0;
		    while(i < n)//the main array is filled  
		    {
		        if(i1 < a1.length && i2 < a2.length) {
		            if(a1[i1] <= a2[i2]) {
		                result[i] = a1[i1];
		                i++;
		                i1++;
		            } else {
		                result[i] = a2[i2];
		                i++;
		                i2++;
		            }
		        } else {
		            if(i1 < a1.length) {
		                result[i] = a1[i1];
		                i++;
		                i1++;
		            } else {
		                result[i] = a2[i2];
		                i++;
		                i2++;
		            }
		        }
		    }
		    return result;
		
	}
	public int[] mergeSort(int a[], int L, int R) {
	    if(L > R) {
	        return new int[0];
	    }
	    if(L == R) {
	        int[] singleElement = {a[L]};
	        return singleElement;
	    }
	    int K = (L + R) / 2;
	    int[] a1 = mergeSort(a, L, K);
	    int[] a2 = mergeSort(a, K + 1, R);
	    int[] result = merge(a1,a2);
	    return result;
	}

	
	public int[] sortArray(int[] nums) {
		return mergeSort(nums,0,nums.length-1);
	}
	public static void main(String[] args) {
		mergeSort_learning2 s = new mergeSort_learning2();
		int[] a1 = {1,3,5,7,9};
		int[] a2 = {2,4,6,8,10};
		System.out.println(Arrays.toString(s.merge(a1,a2)));
		int[] A = {1,5,3,2};
		int[] B = {8,7,6,4};
		int[] C = {1,5,3,2,8,7,6,4};
		System.out.println(Arrays.toString(s.mergeSort(C,0,C.length-1)));
	
	}
	

}
