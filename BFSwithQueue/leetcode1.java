package BFSwithQueue;

public class leetcode1 {
	boolean[][] daDuyet = new boolean[300][300];
	int soHang;
	int soCot;
	public boolean isValid(int i,int j) {
		return i>=0 && j>=0 && i<soHang && j<soCot;
	}
	public void DFS(char[][] a, int i,int j) {
		//B1 : Dieu kien dung | Bai toan co so
		if(isValid(i, j)==false) {
			return;
		}
		if(a[i][j]=='0'||daDuyet[i][j]==true) {
			return;
		}
		daDuyet[i][j]=true;
		DFS(a,i,j+1);
		DFS(a,i,j-1);
		DFS(a,j+1,i);
		DFS(a,j-1,i);
	}
	public int numIslands(char[][] a) {
		soHang=a.length;
		soCot=a[0].length;
		int count =0;
		for(int i=0;i<soHang;i++) {
			for(int j=0;j<soCot;j++) {
				if(a[i][j]==1 && daDuyet[i][j]==false) {
					DFS(a,i,j);
					count++;
				}
			}
		}
		return 0;
        
    }

}
