package advanced_Sorting;

public class mẻgeSorting_review6 {
	//implementing mẻge function 
	public static int[] mergeFunction(int[] array1,int[] array2) {
		int n = array1.length + array2.length;
		int[] newArray = new int[n];
		int i=0;
		int i1=0;
		int i2=0;
		while(i<n) {
			if(i1<array1.length && i2<array2.length) {
				if(array1[i1]<=array2[i2]) {
					newArray[i]=array1[i1];
					i++;
					i1++;
				}else {
					newArray[i]=array2[i2];
					i++;
					i2++;
				}
			}if(i1<array1.length) {
				newArray[i]=array1[i1];
				i++;
				i1++;
			}else {
				newArray[i]=array2[i2];
				i++;
				i2++;
			}
		}
		return newArray;
	}
	//implementing sort function 
	public static int[] sortFunction(int[] array, int L,int R) {
		if(L>R) {
			return new int[0];
		}
		if(L==R) {
			int[] singleElement = {array[L]};
			return singleElement;
		}
		int M = (L+R)/2;
		int[] array1 = sortFunction(array,0,M);
		int[] array2 = sortFunction(array,M+1,R);
		return mergeFunction(array1,array2);
	}
}
