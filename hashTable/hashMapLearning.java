package hashTable;

import java.util.HashMap;
import java.util.Map;

public class hashMapLearning {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,98,7,6,5,4,3,2,1,1,2,3};
		Map<Integer,Integer> myMap = new HashMap<>();
		//Key is the value in array 
		//Value is the number of count 
		for(int i : array) {
			if(myMap.containsKey(i)==false) {
				//i chua xuat hien trong map 
				myMap.put(i, 1);
			}else {
				//i da xuat hien trong map 
				int count = myMap.get(i);
				count++;
				myMap.put(i, count);
			}
		}
		for(Map.Entry entry : myMap.entrySet()) {
			System.out.println(entry.getKey()+" xuat hien " + entry.getValue()+ "lan");
		}
		
	}

}
