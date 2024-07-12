package recursion;

public class hanoiTower_review2 {
	public static void hanoiTower(int number, char A, char B, char C) {
		if(number==1) {
			System.out.println("Chuyen dia tu cot " + A + "sang cot" + C);
			return;
		}
		hanoiTower(number-1,A,C,B);
		System.out.println(" Chuyen dia thu " + number + "tu" + A + "sang" + C);
		hanoiTower(number-1,B,A,C);
	}
	public static void main(String[] args) {
		hanoiTower(4,'A','B','C');
	}

}
