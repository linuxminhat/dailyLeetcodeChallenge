package hashTable;

import java.util.Scanner;

public class myHashMap_learning1 {
	/*
	 * Bai toan " 
	 * Nhap vao n so x 
	 * Sau khi nhap xong.In ra danh sach cac so x va so lan xuat hien tuong ung cua chung 
	 */
	//Lam theo cach chan phuong 
	public static int[] myArray = {1,2,3,4,5,6,7,8,9,10,28,12,29,28,100,39,104,28};
	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner myInput = new Scanner(System.in);
		int intputNumber = myInput.nextInt();
		int count=0;
		for(int number:myArray) {
			if(number==intputNumber) {
				count++;
			}
		}
		System.out.println("Input Number : " + intputNumber);
		System.out.println(count);
	}

}
//Dở khi tập dữ liệu lớn 

