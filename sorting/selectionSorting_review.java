package sorting;

public class selectionSorting_review {
	static int[] array = {1,2345,5,323,54,22,150,23,5,33,52};
	//implementing function to view 
	public static void viewingFunction(int number, int[] array) {
		System.out.printf(" % d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	public static void selectionShorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int maxIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[maxIndex]) {
					maxIndex=j;
				}
			}
			if(maxIndex !=i) {
				int temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}
			viewingFunction(i,array);
		}
	}
	public static void main(String[] args) {
		selectionShorting(array);
	}

}
