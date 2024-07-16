package timeComplexityinSorting;

import java.util.Arrays;

public class bubbleSorting {
	public static int[] array = {5,3,2,7,8,6,1};
	public static int[] bubblesort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				//after the loop i's th it will minus i element
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(bubblesort(array)));
	}
}
