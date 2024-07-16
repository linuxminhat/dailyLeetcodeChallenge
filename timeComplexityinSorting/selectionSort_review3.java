package timeComplexityinSorting;

import java.util.Arrays;

public class selectionSort_review3 {
	public static int[] array = {1231,323,4,21,24,12,34};
	public static int[] selectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int tempMinIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[tempMinIndex]) {
					tempMinIndex=j;
				}
			}
			if(tempMinIndex !=i) {
				int temp = array[i];
				array[i]=array[tempMinIndex];
				array[tempMinIndex]=temp;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(selectionSorting(array)));
	}

}
