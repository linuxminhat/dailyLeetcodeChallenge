package timeComplexityinSorting;

public class bubbleSort_review5 {
	public static int[] bubbleSort(int[] array) {
		//block outside 
		for(int i=0;i<array.length;i++) {//0 + n + n = 2n 
			boolean checking = true;
			//block inside
			for(int j=0;j<array.length-i-1;j++) {// 
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					checking = false;
				}
			}
			if(checking == true) {
				break;
			}
		}
		return array;
	}

}
