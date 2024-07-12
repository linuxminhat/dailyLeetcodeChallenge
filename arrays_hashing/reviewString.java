package arrays_hashing;

public class reviewString {
	public static void main(String[] args) {
		String s1 = new String ("Dang Nhat Minh");
		String s2 = new String ("DangNhatMinh");
		String s3 = new String("244 323 232323 Cadfj faswiqwa aafdasfasf");
		for(int i=0;i<s1.length();i++) {
			if(Character.isUpperCase(s1.charAt(i))==true) {
				System.out.println(s1.charAt(i));
			}
		}
//		for(int j=0;j<s3.length();j++) {
//			if(Character.isDigit(s3.charAt(j)==true)){
//				System.out.println(s3.charAt(j));
//			}
//		}
	}

}
