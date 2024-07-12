package arrays_hashing;

public class leetcode387 {
	public static int firstUniqChar(String s) {
		//chuyen mot mang String thanh mot mang Array 
		char[] array = s.toCharArray();
		//create a count array 
		int[] count = new int[123];
		for(int i=0;i<array.length;i++) {
			char c = array[i];
			int index = (int)c;
			count[index]++;
		}
		return -1;
	} 
	public static void main(String[] args) {
		String s="leetcode";
		firstUniqChar(s);
	}

}
