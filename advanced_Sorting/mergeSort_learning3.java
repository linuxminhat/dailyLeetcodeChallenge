package advanced_Sorting;

public class mergeSort_learning3 {
	public static int[] merge(int[] array1,int[] array2) {
		int n = array1.length+array2.length;
		int[] result = new int[n];
		int i=0;
		int i1=0;
		int i2=0;
		while(i<n) {
			if(i1<array1.length && i2<array2.length) {
				if(array1[i1]<=array2[i2]) {
					result[i]=array1[i1];
					i++;
					i1++;
				}else {
					result[i]=array2[i2];
					i++;
					i2++;
				}
			}else {
				if(i1<array1.length) {
					result[i]=array1[i1];
					i++;
					i1++;
				}else {
					result[i]=array2[i2];
					i++;
					i2++;
				}
			}
		}
		return result;
		
		
	}

}
