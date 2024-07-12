package arrays_hashing;

public class leetcode387_solution {
	//ASCII : 97 -> 122 
	//leetcode -> l 
	//phuong phap ap dung cho cac character 
	public int firstUniqChar(String s) {
		char[] array = s.toCharArray();
		int[] count = new int[123];
		for(int i=0;i<array.length;i++) {
			char c = array[i];
			int index = (int)c;
			count[index]++;
		}
		
		for(int i=0;i<array.length;i++) {
			char c = array[i];
			int index = (int)c;
//			count[index]++;
			if(count[index]==1) {
				return i;
			}
		}
		return -1; 
	}
//	public static void main(String[] args) {
//		String s ="leetcode";
//		firstUniqChar(s);
//	}

}
