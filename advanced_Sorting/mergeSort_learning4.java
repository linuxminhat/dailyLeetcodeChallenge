package advanced_Sorting;

public class mergeSort_learning4 {
	public static int[] mergeFunction(int[] a1, int[] a2) {
		int n =a1.length+a2.length;
		int[] newArray = new int[n];
		int i=0;
		int i1=0;
		int i2=0;
		while(i<n) {
			if(i1<a1.length && i2<a2.length) {
				if(a1[i1]<=a2[i2]) {
					newArray[i]=a1[i1];
					i++;
					i1++;
				}else {
					newArray[i]=a2[i2];
					i++;
					i2++;
				}
			}else {
				if(i1<a1.length) {
					newArray[i]=a1[i1];
					i++;
					i1++;
				}else {
					newArray[i]=a2[i2];
					i++;
					i2++;
				}
			}
		}
		return newArray;
	}
}
