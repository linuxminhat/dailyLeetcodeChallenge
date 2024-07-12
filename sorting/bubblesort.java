package sorting;

public class bubblesort {
//	static int[] array = {99,23,54,121,4243,012,4234,2134,54545};
	static int[] array = {1,2,3,4,5,6,8,7};
	//implementing the function to view 
	public static void  printArray(int no,int[] array) {
		System.out.printf("%d :  ",no);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d " , array[i]);
		}
		System.out.println("");
	}
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean isSorted = true;
			for(int j=0;j<((array.length-1)-i);j++) {
				if(array[j]>array[j+1]) {
					isSorted = false;//Su kien doi cho 
					int t = array[j];
					array[j]=array[j+1];
					array[j+1]=t;
				}
			}
			printArray(i,array);
			if(isSorted==true) {
				break;
			}
		}
	
	}
	public static void main(String[] args) {
		bubbleSort(array);
	}
	

}
