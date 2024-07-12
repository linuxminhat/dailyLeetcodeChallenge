package sorting;

public class insertionSortLearning {
	public static void insertionSort(int[] array) {
		int array_length = array.length;
		//Coi nhu day da sap xep o i=0
		//Chen phan tu thu a[i] vao vi tri 0 -> i-1
		for(int i=1;i<array_length-1;i++) {
			//Ta mieu ta vi tri thich hop de chen la j 
			int ai=array[i];
			int j = i-1;
			while(j>=0 && array[j]>ai) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=array[i];
			
		}
	}

}
