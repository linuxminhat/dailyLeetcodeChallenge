package sorting;

public class selectionSort_review2 {
	public static int[] array= {5,3,2,7,8,1,2};
	//implementing function to viewing 
	public static void viewFunction(int number,int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	//implementing function to bubbleSort 
	public static void bubbleSor(int[] array) {
		for(int i=0;i<array.length;i++) {
			int maxIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[maxIndex]) {
					maxIndex=j;
				}
			}
			if(maxIndex != i ) {
				int temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
			}
			viewFunction(i,array);
		}
	}
	public static void main(String[] args) {
		bubbleSor(array);
	}

}
