package sorting;

public class insertionSort_review1 {
	public static int[] array = {5,3,2,7,8,1,2};
	public static void insertionSort(int[] array) {
		int alength = array.length;
		for(int i=1;i<alength;i++) {
			//Moi lan duyet 
			//Chen phan tu a[i] vao day 0->i-1
			int ai=array[i];
			int j=i-1;
			while(j>=0 && array[j]>ai) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=ai;
			
		}
	}

}
