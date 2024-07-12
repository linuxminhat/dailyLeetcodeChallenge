package sorting;

public class insertionSorting_review4 {
	//declare array 
	public static int[] array = {3,53453,232,43,64,12,15535,23,30};
	//implementing function to viewing 
	public static void viewingFunction(int number,int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	//implementing function insertion Sort 
	public static void insertionSorting(int[] array) {
		for(int i=1;i<array.length;i++) {
			int ai = array[i];
			int j=i-1;
			while(j>=0 && array[j]>ai) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=ai;
			viewingFunction(i,array);
		}
	}
	public static void main(String[] args) {
		insertionSorting(array);
	}

}
