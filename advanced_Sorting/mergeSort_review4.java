package advanced_Sorting;

public class mergeSort_review4 {
	//implementing merge function
	public static int[] mergeFunction(int[] array1, int[] array2) {
		int n = array1.length + array2.length;
		int[] resultArray = new int[n];
		int i=0;
		int i1=0;
		int i2=0;
		while(i<n) {
			if(i1<array1.length&&i2<array2.length) {
				if(array1[i1]<=array2[i2]) {
					resultArray[i]=array1[i1];
					i++;
					i1++;
				}else {
					resultArray[i]=array2[i2];
					i++;
					i2++;
				}
				if(i1<array1[i1]) {
					resultArray[i]=array1[i1];
					i++;
					i1++;
				}else {
					resultArray[i]=array2[i2];
					i++;
					i2++;
				}
			}
		}
		return resultArray;
	}
	public static int[] mergeSorting(int[] array, int L,int R) {
		if(L>R) {
			return new int[0];
		}
		if(L==R) {
			int[] singleElement = {array[L]};
			return singleElement;
		}
			int K = (L+R)/2;
			int[] array1 = mergeSorting(array,0,K);
			int[] array2 = mergeSorting(array,K+1,R);
			int[] finalArray = mergeFunction(array1,array2);
			return finalArray;
	}

}
