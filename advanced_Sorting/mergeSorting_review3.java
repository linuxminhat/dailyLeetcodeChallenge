package advanced_Sorting;

public class mergeSorting_review3 {
	
	public int[] mergeSort(int[]a, int L,int R) {
		//L : chi so dau cua mang 
		//R : chi so cuoi cua mang 
	 
		if(L>R) {
			return new int[0];
		}
		if(L==R) {
			int[] singleElement = {a[L]};
			return singleElement;
		}
		
		//THTQ 
		//B1 : Chia ra
		System.out.println("Chia : " + L + " - " + R);
		int K = (L+R)/2;
		int[] a1 = mergeSort(a,L,K);
		int[] a2 = mergeSort(a,K+1,R);
		
		//B2 : Tron vao a2 va a1 la cac mang da duoc sap xep 
		int newLength = a1.length+a2.length; 
		int[] result = new int[newLength];
		int i=0,i1=0,i2=0;
		while(i<newLength) {
			if(i1<a1.length && i2<a2.length) {
				if(a1[i1]<=a2[i2]) {//truong hop a1 nho hon
					result[i]=a1[i1];
					i++;i1++;
				}else {
					result[i]=a2[i2];
					i++;i2++;
				}
			}else {
				if(i1<a1.length) {
					result[i]=a1[i1];
					i++;i1++;
				}else {
					result[i]=a2[i2];
					i++;i2++;
				}
			}
		}
		return result;
	}
	public int[] sortArray(int[] nums) {
		
		return mergeSort(nums, L, nums.length-1);
	}

}
