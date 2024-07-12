package arrays_hashing;

public class leetcode1662 {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String word1_output ="";
		String word2_output ="";
			for(String element1:word1) {
				word1_output+=element1;
			}
			for(String element2:word2) {
				word2_output+=element2;
			}
			if(word1_output.equals(word2_output)) {
				return true;
			}
		return false;
	}

}
