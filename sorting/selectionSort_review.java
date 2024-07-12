package sorting;

public class selectionSort_review {
	public static int[] array = {100,234,345923,2323,121,42349,222};
	//implementing function to view 
	public static void viewingFunction(int number, int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	//implementing selectionSorting 
	public static void selectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex=j;
				}
			}
			if(minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
				
			}
		}
	}

}
