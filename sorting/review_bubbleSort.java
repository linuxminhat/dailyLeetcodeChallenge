package sorting;

public class review_bubbleSort {
	//9 8 7 6 5 4 
	//8 9 7 6 5 4 
	//declare array 
	public static int[] array = {12,434,36,24234,945,202,332};
	//implementing function to view 
	public static void viewingFunction(int number, int[] array) {
		System.out.printf(" %d : ", number);
		for(int i=0; i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	public static void bubbleSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
	}

}
