package arrays_hashing;

public class leetcode387_review {
	public int firstUniqChar(String s) {
		char[] array = s.toCharArray();
		int[] count = new int[123];
		for(int i=0;i<array.length;i++) {
			char ch = array[i];
			int index = (int) ch;
			count[index]++;
			if(count[index]==1) {
				return i;
			}
		} 
        return -1;
    }

}
