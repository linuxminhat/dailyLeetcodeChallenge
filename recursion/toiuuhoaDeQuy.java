package recursion;

public class toiuuhoaDeQuy {
	//de quy
	public static int fibonacci1(int number) {
		if(number<0) {
			return -1;
		}
		if(number<=2) {
			return 1;
		}
		return fibonacci1(number-1) +  fibonacci1(number-2);
	}
	//khu de quy 
	static int[] F = new int[1000];
	public static int fibonacci2(int n) {
		if(F[n] !=0) {
			return F[n];
		}
		System.out.println("Can tinh F[" + n + "]");
		if(n<=2) {
			F[1] = 1;
			F[2] = 1;
			return 1;
		}
		F[n] = fibonacci2(n-1) + fibonacci2(n-2);
		return F[n];
	}
	
	public static void main(String[] args) {
		fibonacci2(4);
	}
	

}
