package recursion;

public class methodImplementRecursion {
	private static int currentMax = -1;
	public static void findMax1(int[] array,int i ) {
		if(i<array.length) {
			if(array[i]>currentMax) {
				currentMax=array[i];
			}
			findMax1(array,i+1);
		}
		
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	}

}
