package recursion;

public class fibonacci {
	//Tìm số fibonacci thứ n 
	public static int fibonacciFunction(int number) {
		if(number<=0) {
			return 0;
		}
		if(number<=2 ) {
			return 1;
		}
		return fibonacciFunction(number-1)+fibonacciFunction(number-2);
		/*
		 * 4 -> 3 + 2 
		 * 2 + 1 + 1 + 0 
		 */

	}
	public static void main(String[] args) {
		fibonacciFunction(10);
		System.out.println(fibonacciFunction(4));
	}
}
