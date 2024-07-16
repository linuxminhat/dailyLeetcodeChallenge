package timeComplexityinSorting;

public class bubbleSort_review4 {
	public static int[] bubbleSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean checking = true;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			if(checking == true) {
				break;
			}
		}
		return array;
	}

}
