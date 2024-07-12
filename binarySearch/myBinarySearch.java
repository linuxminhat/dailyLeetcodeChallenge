package binarySearch;

public class myBinarySearch {
	//declare an array 
	static int[] array = {1,4,9,12,19,25,31,46,50,57,52};
	//implementing binary search function
	public static int binarySearching(int[] array, int key) {
		int iLeft = 0;
		int iRight = array.length - 1;
		//Lam sao de khong duoc chay qua 
		while(iLeft<=iRight) {
			int iMidle = (iLeft+iRight)/2;
			if(key == array[iMidle]) {
				return iMidle;//yeu cau tra ve chi so cua mang can tim 
			}else {
				if(key>array[iMidle]) {
					iLeft = iMidle+1;
				}else {
					iRight=iMidle-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(binarySearching(array,31));
	}

}
