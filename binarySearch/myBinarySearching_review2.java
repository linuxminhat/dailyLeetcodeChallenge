package binarySearch;

public class myBinarySearching_review2 {
	//declare an array 
	static int[] array = { 1,2,3,4,5,6,7,8,9,10};
	//implementing an array 
	public static int binarySearching(int[] array, int key) {
		int iLeft= 0;
		int iRight = array.length-1;
		while(iLeft<=iRight) {
			int iMid = (iLeft+iRight)/2;
			if(key==array[iMid]) {
				return iMid;
			}else {
				if(key>array[iMid]) {
					iLeft++;
				}else {
					iRight++;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		binarySearching(array,5);
		System.out.println(binarySearching(array,100));
	}

}
