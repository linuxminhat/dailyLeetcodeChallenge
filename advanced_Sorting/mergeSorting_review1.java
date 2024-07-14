package advanced_Sorting;

public class mergeSorting_review1 {
	
	public static void merge(int[] array,int left,int mid,int right) {
		//ben trai : left -> mid 
		//ben phai : mid+1 -> right 
		//In ra do dai moi ben 
		int left_length=mid-left+1;
		int right_length = right-mid;
		//Tao mang tam thoi 
		int[] array_left = new int[left_length];
		int[] array_right = new int[right_length];
		for(int i=0;i<left_length;i++) {
			array_left[i]=array_left[left+1];
		}
//		for(int i=0;i<)
		
	}
	public static void mergeSorting(int[] array,int left,int right) {
		//Mien la left<right thi luon luon phai mergeSort
		if(left<right) {
			int mid =(left+right)/2;
			//goi lai de quy tung thang ben trai va ben pha i
			mergeSorting(array,left,mid);
			mergeSorting(array,mid+1,right);
			
		}
	}
	
	

}
