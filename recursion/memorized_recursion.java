package recursion;

public class memorized_recursion {
	public static int fibonacci2(int number) {
		int[] F = new int[1000];
		if(F[number]!=0) {
			return F[number];
		}
		if(number<=1) {
			F[1] = 1;
			F[2] = 1;
			return 1;
		}
		F[number] = fibonacci2(number-1) + fibonacci2(number-2);
		return F[number];
	}
	public static void main(String[] args) {
		fibonacci2(99);
		System.out.println(fibonacci2(12));
	}
	

}
