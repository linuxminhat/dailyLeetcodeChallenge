package recursion;

public class implementingFactorialFunction {
	public static int factorialFunction(int number) {
		int factorial=1;
		if(number==0) {
			return 1;
		}
		while(number>0) {
			factorial*=number;
			number--;
		}
		return factorial;
	}
	public static void main(String[] args) {
		factorialFunction(5);
		System.out.println(factorialFunction(7));
	}

}
