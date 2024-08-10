package BFSwithQueue;

public class leetcode200 {
	boolean[][] daDuyet = new boolean[300][300];
	int soHang;
	int soCot;
	public boolean isValid(int i,int j) {
		return i>=0 && j>=0 && i<soHang && j<soCot;
	}
	public void DFS(char[][] a,int i,int j) {
		//B1 : Dieu kien dung 
	//Kiem tra tinh hop le
		if(isValid(i,j) == false) {
			return;
		}
		if(a[i][j]=='0'||daDuyet[i][j]==true) {
			//Da duyet roi
			return;
		}
		//Danh dau da duyet 
		//Neu nhu chua thi danh dau la da duyet 
		daDuyet[i][j]=true;
		DFS(a, i, j + 1); // phải là j + 1 để di chuyển sang cột bên phải
	    DFS(a, i, j - 1); // phải là j - 1 để di chuyển sang cột bên trái
	    DFS(a, i + 1, j); // phải là i + 1 để di chuyển xuống hàng phía dưới
	    DFS(a, i - 1, j); // phải là i - 1 để di chuyển lên hàng phía trên
		
		
		
		
	}
	 
	public int numIslands(char[][] a) {
		int count=0;
		soHang = a.length;
		soCot = a[0].length;
		for(int i=0;i<soHang;i++) {
			for(int j=0;j<soCot;j++) {
				if(a[i][j]=='1' && daDuyet[i][j]==false) {
					DFS(a,i,j);//Goi het, hoan thanh roi moi count++
					count++;
				}
			}
		}
		
		
		
		
		return count;
        
    }

}
