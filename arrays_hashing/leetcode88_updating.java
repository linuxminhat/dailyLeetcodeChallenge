package arrays_hashing;

public class leetcode88_updating {
	//Chèn phần tử n2 lần lượt vào phần tử n1 
	/*
	 * n1 = 1 2 3 / n2 = 2 5 6 
	 * 1 2 2 3 
	 * 1 2 2 3 5 
	 * 1 2 2 3 5 6 
	 */
	/*
	 * Ý tưởng : 
	 * Ta sẽ dùng vòng lặp for duyệt toàn bộ phần tử trong n2 
	 * Sau đó chúng ta sẽ tạo ra một hàm để chèn vào n1
	 */
	 public static void merge(int[] n1, int m, int[] n2, int n) {
		 for(int ai:n2) {
			 chenPhanTuVaoMang(ai,n1,m);
			 //mỗi lần chèn phần tử vào thì tăng lên 1 
			 m++;
		 }      
	 }
	private static void chenPhanTuVaoMang(int x, int[] a, int m) {
		//tìm phần tử đầu tiên mà giá trị ta định chèn nhỏ hơn 
		//gọi phần tử đầu tiên đó index = k, thì ta sẽ lùi k cho đến m-1
		//xác định k mà phẩn tử đầu tiên lớn hơn x 
		//không có thì chèn cuối cùng 
		//có thì dịch chuyển sang phải sau đó gán 
		boolean timDuocK=false;//Giả sử ban đầu chưa tìm được 
		for(int k=0;k<m;k++) {
			if(a[k]>x) {
				timDuocK=true;	
				for(int i=m-1;i>=k;i--) {
					a[i+1]=a[i];
				}
				a[k]=x;
				break;
			}
		}
		if(timDuocK==false){
			a[m]=x;
		}
	}
	public static void main(String[] args) {
		int[] n1 = {2,3,4,5,0,0,0};
		int[] n2 = {3,0,6};
		merge(n1,4,n2,3);
		System.out.println("Done");
	}
}
