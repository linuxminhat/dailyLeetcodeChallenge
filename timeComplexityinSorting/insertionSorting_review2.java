package timeComplexityinSorting;

public class insertionSorting_review2 {
	public static int[] insertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int ai=array[i];
			int j=i-1;
			while(j>=0 && array[j]>array[i]) {
				array[j+1]=array[j];
				j--; 
			}
			array[j+1]=ai;//vi co i-- ma 
		}
		return array;
	}

}
