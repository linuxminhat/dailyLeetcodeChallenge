package sorting;

public class insertionSort_review2 {
	//declare array
	public static int[] array = {5,3,2,7,8,1,2 };
	//implementing insertion sort function
	public static void insertionSort(int[] array) {
		//Xet tu phan tu thu 2 
		//Vi da gia su phan tu thu 1 da duoc sap xep roi 
		
		for(int i=1;i<array.length;i++) {
			int ai=array[i];
			//Khai bao phan tu j dau tien lien ke truoc do 
			int j=i-1;
			while(j>0 && array[j]>ai) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=ai;
		}
	}

}
