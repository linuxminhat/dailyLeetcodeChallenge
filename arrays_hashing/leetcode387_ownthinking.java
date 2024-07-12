package arrays_hashing;

public class leetcode387_ownthinking {
	public static int firstUniqChar(String s) {
		char[] array = s.toCharArray();
		for(int i=0;i<array.length;i++) {
			int temp_count=0;
			for(int j=0;j<array.length;j++) {
				if(i!=j && array[i]==array[j]) {
					temp_count++;
//					if(temp_count==0) {
//						return j;
//					}
				}
			}
			if(temp_count==0) {
				return i;
			}
		}
		return -1;   
	}
	public static void main(String[] args) {
		System.out.println(firstUniqChar("aabb"));
	}
	

}
