package recursion;

public class hanoiTower_updating {
	public static void solveHanoiTower(int n,char nguon, char dich, char trunggian) {
		if(n==1) {
			System.out.println("Chuyen 1 dia tu " + nguon + "den" + dich);
			return;
		}
		solveHanoiTower(n-1,nguon,trunggian,dich);
		System.out.println("Chuyen dia thu " + n+ "tu" + nguon + "den" + dich);
		solveHanoiTower(n-1, trunggian,dich, nguon);
	}
	public static void main(String[] args) {
		solveHanoiTower(5,'A','B','C');
	}

}
