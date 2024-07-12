package binarySearch;

public class recursion_binarySearching {
	//implementing binary search in recursion way
	public static int bSearch(int[] array, int key,int iLeft, int iRight ) {
		if(iLeft>iRight) {
			return -1;
		}
		int iMid = ((iLeft+iRight)/2);
		if(key ==array[iMid]) {
			return iMid;
		}else {
			if(key>array[iMid]) {
				return bSearch(array,key,iMid+1,iRight);
			}else {
				return bSearch(array,key,iLeft,iMid-1);
			}
		}
		
	}
	public static int bSearch(int[] array, int key) {
		return bSearch(array,key,0,array.length-1);
	}
	

}
