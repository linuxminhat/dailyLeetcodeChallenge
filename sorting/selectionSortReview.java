package sorting;

public class selectionSortReview {
	public static int[] array = {232,45,32,1,434,43,6,3,23};
	//implementing function to viewing 
	public static void viewingFunction(int number,int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	public static void selectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
	}

}
