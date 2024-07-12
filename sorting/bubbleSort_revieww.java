package sorting;

public class bubbleSort_revieww {
	//declare an array 
	public static int[] array = {100,99,23,28,5,9,23,42};
	//implementing viewingFunction
	public static void viewingBubbleSort(int number,int[]array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	//implementing bubbleSort
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean checking = true;
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					checking = false;
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			viewingBubbleSort(i,array);
			if(checking==true) {
				break;
			}
			 
		}
	}
	public static void main(String[] args) {
		bubbleSort(array);
	}
	

}
