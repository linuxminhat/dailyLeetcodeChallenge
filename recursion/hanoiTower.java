package recursion;

public class hanoiTower {
	public static void solveHanoiTower(int n, char nguon, char dich , char trunggian) {
		if(n==1) {
			System.out.println("Moving disk from" + nguon + "to" + dich);
		}
		solveHanoiTower(n-1, nguon, trunggian, dich);
		System.out.println("Moving disk from " + n + "tucoc" + nguon + "sangcoc" + dich );
		solveHanoiTower(n-1, trunggian ,dich,nguon);
		
	}
	public static void main(String[] args) {
		solveHanoiTower(3,'A','C','B');
	}

}
