package recursion;

public class recursion_tinhtong1denn {
	public static int tinhTong1denN(int number) {
		//phải khai báo number==0 để dừng vòng lặp, đây là điều kiện dừng 
		if(number==0) {
			return 0;
		}
		return number+tinhTong1denN(number-1);
	}
	public static void main(String[] args) {
		tinhTong1denN(10);
		System.out.println(tinhTong1denN(10));
	}

}
