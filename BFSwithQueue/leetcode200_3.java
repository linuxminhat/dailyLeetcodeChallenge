package BFSwithQueue;

public class leetcode200_3 {
	int soHang;
	int soCot;
	boolean[][] daDuyet = new boolean [300][300];
	public boolean isValid(int i,int j) {
		return i>=0 && j>=0 && i<soHang && j<soCot;
	}
	public void DFS(char[][] grid,int i,int j) {
		//B1 : Dieu kien dung | Bai toan co so 
		if(isValid(i,j)==false) {
			return;
		}
		if(grid[i][j]=='0' && daDuyet[i][j]==true) {
			return ;
		}
		daDuyet[i][j]=true;
		DFS(grid,i,j+1);
		DFS(grid,i,j-1);
		DFS(grid,i+1,j);
		DFS(grid,i-1,j);
		
	}
	public int numIslands(char[][] grid) {
		soHang = grid.length;
		soCot = grid[0].length;
		int count = 0;
		for(int i=0;i<soHang;i++) {
			for(int j=0;j<soCot;j++) {
				if(grid[i][j]=='1' && daDuyet[i][j]==false) {
					DFS(grid,i,j);
					count++;
					
				}
			}
		}
		
        return 0;
    }

}
