package sorting;

public class insertiongSort_review3 {
	//declare an array 
	public static int[] array = {5,3,2,65,2,64,23,12,76};
	//implementing function to view 
	public static void viewingFunction(int number, int[] array) {
		System.out.printf("%d", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf("%d",array[i]);
		}
		System.out.println(" ");
	}
	public static void insertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int ai=array[i];
			int j=i-1;//tim phan tu dau tien lien ke 
			while(j>=0 && array[j]>ai) {
				//thuc hien lui ve ben phai 
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=ai;
		}
	}

}
