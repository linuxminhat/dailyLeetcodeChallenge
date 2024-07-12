package sorting;

public class selectionSort_review4 {
	public static int[] array = { 223,143,92,212,3223,52,954,2323,14,44,1,234,5,632,232};
	//implementing viewing function 
	public static void viewingFunction(int number,int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" % d ", array[i]);
		}
		System.out.println(" ");
	}
	
	public static void bubbleSorting(int[] array) {
		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			viewingFunction(i,array);
		}
		
	}
	public static void main(String[] args) {
		bubbleSorting(array);
	}
}
