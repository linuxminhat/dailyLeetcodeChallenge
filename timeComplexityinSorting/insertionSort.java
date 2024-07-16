package timeComplexityinSorting;

import java.util.Arrays;

public class insertionSort {
	public static int[] array = {5,23,2,2,1,5345,212,10};
	public static int[] insertionSortarray(int[] array) {
		for(int i=1;i<array.length;i++) {
			int ai=array[i];
			int j=i-1;
			while(j>=0 && array[j]>ai) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=ai;
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(insertionSortarray(array)));
	}

}
