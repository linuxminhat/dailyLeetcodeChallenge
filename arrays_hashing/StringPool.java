package arrays_hashing;

public class StringPool {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println("s1==s2"+(s1==s2));//true
		System.out.println("s1==s3"+(s2==s3));//false
		System.out.println("s2==s3"+(s2==s3));//false
		//Giai thich 
		/*
		 * Trong Java, có một khái niệm gọi là String Pool.
		 * String Pool là một vùng nhớ đặc biệt nơi các chuỗi có giá trị giống nhau được lưu trữ duy nhất một lần.
		 * Khi bạn tạo một chuỗi bằng cách sử dụng dấu ngoặc kép (ví dụ: "Hello"),  
		 * Java sẽ kiểm tra String Pool để xem liệu một chuỗi giống hệt đã tồn tại hay chưa.
		 * Nếu tồn tại, Java sẽ sử dụng lại tham chiếu đến chuỗi đó thay vì tạo một đối tượng mới.


		 */
	}
}
