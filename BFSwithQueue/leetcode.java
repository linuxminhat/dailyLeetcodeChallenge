package BFSwithQueue;

public class leetcode {
	int a,b;
	public static void continueHor(int u) {
		u++;
	}
	public static void continueVer(int v) {
		v++;
	}
	public static void continueVerHor(int hor, int ver) {
		ver=ver++;
		hor=hor++;
	}
	public int numIslands(char[][] grid) {
		a=0;
		b=0;
		int u = grid.length;//hor
		int v = grid[0].length;//ver
		while(a<=u && b<=v) {
			a=a+1;
			b=b+1;
			if(grid[a][b-1] ==1 || grid[a-1][b]==1) {
				
			}
			
		}
		return 0;
        
    }

}
