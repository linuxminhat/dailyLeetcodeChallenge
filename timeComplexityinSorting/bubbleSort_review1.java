package timeComplexityinSorting;

public class bubbleSort_review1 {
	//implementing bubble sort function 
	public static int[] bubblesort(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean checking = true;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					checking = false;
				}
			}
			if(checking==true) {
				break;
			}
		}
		return array;
	}

}
