package sorting;

public class bubbleSort_review {
	static int[] array = {99,23,54,121,4243,012,4234,2134,54545};
	//implementing printBubbleSort
	public static void printingBubbleSort(int n,int[] array) {
		System.out.printf(" %d :  ",n);
			for(int j=0;j<array.length;j++) {
				System.out.printf(" %d ", array[j]);
		}
			System.out.println(" ");
	}
	//implementing bubblesort
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean checking = true;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					checking = false;
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			printingBubbleSort(i, array);
			if(checking == true) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		bubbleSort(array);
	}

}
