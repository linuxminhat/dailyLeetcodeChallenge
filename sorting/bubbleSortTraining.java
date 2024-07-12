package sorting;

public class bubbleSortTraining {
	static int[] array = {1,2,4,3,6,7,9,12,10,11};
	//implementing function to viewing 
	public static void viewingFunction(int numbElements,int[] array) {
		System.out.printf(" %d ",numbElements);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	//implementing bubble Sort function
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		viewingFunction(i,array);
		}
	}
	public static void main(String[] args) {
		bubbleSort(array);
	}
}
