package timeComplexityinSorting;

import java.util.Arrays;

public class selectionSort_review1 {
	public static int[] array = {5,3,2,7,8,6,1};
	public static int[] selectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int tempMinIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[tempMinIndex]) {
					tempMinIndex=j;
				}
			   }
			if(tempMinIndex!=i) {
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
