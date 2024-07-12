package sorting;

public class selectionSort_review3 {
	//implementing array 
	public static int[] array = {111,442,56,3,234,790,2,75};
	//implementing function to viewing 
	public static void viewingFunction(int number, int[] array) {
		System.out.printf("%d:" , number);
		for(int i = 0; i<array.length ; i ++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	public static void selectionSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			int maxIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[maxIndex]) {
					maxIndex=j;
				}
			}
			if(maxIndex != i) {
				int temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}
			viewingFunction(i,array);
		}
	}
	public static void main(String[] args) {
		selectionSort(array);
	}
}
