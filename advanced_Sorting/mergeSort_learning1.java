package advanced_Sorting;

public class mergeSort_learning1 {
	public int[] merge(int[] a1, int[] a2) {
		int n = a1.length+a2.length;
		int[] result = new int[n];
		int i =0, i1=0,i2=0;
		while(i<n) {
			if(i1<a1.length && i2<a2.length) {
				if(a1[i1]<=a2[i2]) {
					result[i]=a1[i1];
					i++;i1++;
				}else {
					result[i]=a2[i2];
					i++;i2++;
				}
			}else {
			 
				if(i1<a1.length) {
					result[i]=a1[i1];
					i++;i2++;
				}
			}
		}
		return result; 
	}
	
	public int[] mergeSort(int[] a, int L, int R) {
		if(L>R) {
			return new int[0];
		}
		if(L==R) {
			int[] singleElement = {a[L]};
			return singleElement;
		}
		//conclusion
		
		
		//divide 
		System.out.println("Divide : " + L + " - " + R);
		int K=(L+R)/2;
		int[] a1 = mergeSort(a,L,K);
		int[] a2 = mergeSort(a,K+1,R);
		//merge
		int[] result = merge(a1,a2);
		return result;
	}
	public int[] sortArray(int[] nums) {
		return mergeSort(nums,0, nums.length);
		
	}
	

}
