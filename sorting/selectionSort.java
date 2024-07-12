package sorting;

public class selectionSort {
	public static int[] array = { 100,323,4921,40232,242,124,2423};
	//implementing function to print 
	public static void viewFunction(int number,int[] array) {
		System.out.printf(" %d " ,number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i] );
		}
		System.out.println(" ");
	}
	public static void selectionSorting(int[] array) {
		int a_length=array.length;
		for(int i=0;i<a_length;i++) {
			int minIndex=i;
			for(int j=i+1;j<a_length;j++) {
				//Tim min tu i+1 den n 
				if(array[j]<array[minIndex]) {
					minIndex=j;
				}
			}
			//Gia su co tim duoc 1 phan tu nho hon i 
			//Co tim duoc 1 phan tu nho hon i 
			if(minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
			viewFunction(i,array);
		}
	}
	public static void main(String[] args) {
		selectionSorting(array);
	}
	

}
