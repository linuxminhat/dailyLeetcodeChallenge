package advanced_Sorting;

import java.security.DomainCombiner;
import java.util.Arrays;

public class quickSort_learning1 {
	public static void quickSort(int[]a , int L,int R) {
		if(L>=R) {
			return ;
		}
		//B1 : Chon khoa 
		int key = a[(L+R)/2];
		
		//B2 : Phan bo lai mang theo khoa 
		int k = partition(a,L,R,key);
		System.out.println("L="+L+"R="+R+"key="+key+"k="+k);
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R-+11)));
		System.out.println("------------------");
		//B3 : Chia doi mang va lap lai 
		quickSort(a,L,k-1);
		quickSort(a,k,R);
		
	}
	//return pivot value 
	public static int partition(int[] a,int L,int R, int key) {
		int iL=L;
		int iR=R;
	
		while(iL<=iR) {
			while(a[iL]<key) {
				iL++;
				
			}
			while(a[iR]>key) {
				iR--;
			}
			if(iL<=iR) {
				int temp=a[iL];
				a[iL]=a[iR];
				a[iR]=temp;
				iL++;
				iR--;
			}
		}
		return iL;
	}
	public static void main(String[] args) {
		int[] a= {6,7,8,5,4,1,2,3};
		quickSort(a,0,a.length-1);
		 
	}
}
