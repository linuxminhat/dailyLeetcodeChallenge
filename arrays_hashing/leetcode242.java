package arrays_hashing;

import java.util.Arrays;

public class leetcode242 {
/*
 * s=hello -> 0 1 2 3 4 
 * t=olleh -> 0 1 2 3 4 
 */
	public boolean isAnagram(String s, String t) {
		char[] charArray_S = s.toCharArray();
		char[] charArray_T = t.toCharArray();
		if (charArray_S.length != charArray_T.length) {
	        return false; // Nếu độ dài khác nhau, hai chuỗi không thể là Anagram
	    }
	    Arrays.sort(charArray_S);
	    Arrays.sort(charArray_T);
	    
	    // So sánh hai mảng sau khi sắp xếp
	    return Arrays.equals(charArray_S, charArray_T); 
	}
}
