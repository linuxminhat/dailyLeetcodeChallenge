package sorting;

public class selectionSorting_review2 {
	//declare an array 
	public static int[] array = {1212,2323,214,21412,2454112,5564,232,2121,503,3232,2124,2345,253};
	//implemting function to viewing 
	public static void viewingFunction(int number, int[] array) {
		System.out.printf(" %d ",  number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	
	//implementing function to selectionSort 
	public static void selectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int temp=array[i];
				array[i]=array[minIndex];
				array[minIndex]=temp;
			}	
			viewingFunction(i,array);
		}
		 
	}
	public static void main(String[] args) {
		selectionSorting(array);
	}
}
