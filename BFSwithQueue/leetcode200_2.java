package BFSwithQueue;

public class leetcode200_2 {
	boolean[][] daDuyet = new boolean[300][300];
	int soHang;
	int soCot;
	public static void DFS(char[][] grid,int i,int j) {
		
	}
	public int numIslands(char[][] grid) {
		soHang = grid.length;
		soCot = grid[0].length;
		int count = 0;
		for(int i=0;i<soHang;i++) {
			for(int j=0;j<soCot;j++) {
				if(grid[i][j]==1 && daDuyet[i][j]==false) {
					DFS(grid,i,j);
					count++;
				}
			}
		}
		return 0;
        
    }

}
