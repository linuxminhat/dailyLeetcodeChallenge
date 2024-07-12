package recursion;

public class printArrayElement {
	static int i;
	public static void printinting(int[] array) {
		if(i==0) {
			System.out.println(array[i]);
			return;
		}
		while(i>0) {
			printinting(array);
			i--;
		}
		
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		printinting(array);
	}

}
