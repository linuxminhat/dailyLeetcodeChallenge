package sorting;

public class insertiongSort_review4 {
	//declare an array 
	public static int[] array = {12,43,23,3,545,232,4,65,3,4,32};
	//implementing function to viewing 
	public static void viewingFunction(int number,int[] array) {
		System.out.printf(" %d ", number);
		for(int i=0;i<array.length;i++) {
			System.out.printf(" %d ", array[i]);
		}
		System.out.println(" ");
	}
	public static void insertionSorting(int[] array) {
		for(int i=1;i<array.length;i++) {
			int ai=array[i];//tham chieu toi gia tri so sanh hien tai 
			int j = i-1;//tham chieu toi index truoc gia tri lay moc hien tai 
			while(j>=0 && array[j]>ai) {
				array[j+1]=array[j];
				j--;
			}
			//trong truong hop khong tim duoc gia tri lon hon thi : 
			array[j+1]=ai;
			viewingFunction(i,array);
		}
	}
	public static void main(String[] args) {
		insertionSorting(array);
	}

}
