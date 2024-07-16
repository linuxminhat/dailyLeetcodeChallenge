package timeComplexityinSorting;

import java.util.Arrays;

public class selectionSort_review2 {
	public static int[] array = {12,232,54,90,343,1,25,67,91};
	public static int[] selectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex !=i) {
				int temp = array[i];
				array[i]=array[minIndex];
				array[minIndex]=temp;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(selectionSorting(array)));
	}

}
