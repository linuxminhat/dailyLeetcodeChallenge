package hashTable;

import java.util.Scanner;

public class designingAHashSet_old {
	//Nhap vao n so x => Tai moi thao tac, kiem tra xem so x da xuat hien truoc do hay chua 
	/*
	 * Nhap 10 phan tu 
	 * 1 => false
	 * 2 => false 
	 * 3 => false 
	 * 1 => false 
	 */
	//Giai theo cach chan phuong nhat 
	static int count=0;
	static int[] newArray = {1,2,3,4,5,1,2,3,556,28};
	public static boolean countTrueorFalse(int count) {
		if(count>=2) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner newInput = new Scanner(System.in);
		int inputNumber = newInput.nextInt();
		for(int input:newArray) {
			if(input == inputNumber) {
				count++;
			}
		}	 
		System.out.println(countTrueorFalse(count));
	}

}
//Tuy nhien cach nay khong toi uu trong truong hop luong phan tu qua lon 
