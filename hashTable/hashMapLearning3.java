package hashTable;

import java.util.HashMap;
import java.util.Map;

public class hashMapLearning3 {
	public static void main(String[] args) {
		//declare an array 
		int[] myArray = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
		Map<Integer,Integer> myMap = new HashMap<>();
		for(int value : myArray) {
			if(myMap.containsKey(value)!=true) {
				myMap.put(value, 1);
			}else {
				int count = myMap.get(value);
				count++;
				myMap.put(value, count);
			}
		}
		for(Map.Entry mapEntry : myMap.entrySet() ) {
			System.out.println(mapEntry.getKey() + "xuat hien" + mapEntry.getValue());
		}
	}

}
