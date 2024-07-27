package hashTable;

import java.util.HashMap;
import java.util.Map;

public class leetcode387 {
	public int firstUniqChar(String s) {
		int count=1;
		char[] myArray = s.toCharArray();
		Map<Character,Integer> valueAllMap = new HashMap<>();
		Map<Character,Integer> notSameMap = new HashMap<>();
		for(char value : myArray) {
			if(valueAllMap.containsKey(value)!=true) {
				valueAllMap.put(value, count);
			}else {
				count++;
				valueAllMap.put(value,count);
			}
		}
		
		
		return 0;
        
    }
}
