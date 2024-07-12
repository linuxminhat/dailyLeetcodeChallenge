package sorting;

public class bubbleSort_review2 {
	//setting array
	static int[] array = {12,234556,113,353,100,29420,421,22424};
	//implementing function to view 
	public static void viewingFunction(int number,int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d " , array[i]);
		}
		System.out.println(" ");
//		return number;
	}
	//implementing bubble sort function
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			viewingFunction(i,array);
		}
	}
	public static void main(String[] args) {
		bubbleSort(array);
	}

}
