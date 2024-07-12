package binarySearch;

public class myBinarySearching_review {
	//implementing array 
	static int[] array = {1,2,3,4,5,6,7,8,9,10};
	//implementing function to search 
	public static int myBinarySearching(int[] array, int findingValue) {
		//Phai luon co 2 bien dau va cuoi 
		int indexLeft = 0;
		int indexRight = array.length-1;
		while(indexLeft<=indexRight) {
			int indexMidle = (indexLeft+indexRight)/2;
			if(findingValue==array[indexMidle]) {
				return indexMidle;
			}else {
				if(findingValue>array[indexMidle]) {
					indexLeft = indexMidle+1;
				}else {
					indexRight = indexMidle-1;
				}
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		myBinarySearching(array,6);
		System.out.println(myBinarySearching(array,6));
	}

}
