package binarySearch;

public class myBinarySearching_review3 {
	//declare an array  
	static int[] array = {10,11,12,13,14,15,16,17,18,19,20};
	//implementing function 
	public static int searchingBinary(int[] array, int findingValue) {
		int iLeft=0;
		int iRight=array.length-1;
		while(iLeft<=iRight) {
			int iMid = (iLeft+iRight)/2;
			if(findingValue==array[iMid]) {
				return iMid;
			}else {
				if(findingValue>array[iMid]) {
					iLeft++;
				}else {
					iRight++;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(searchingBinary(array,19));
	}

}
