package hashTable;

import java.util.HashMap;
import java.util.Map;

public class hashMapLearning2 {
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1,28,28,29,29,3,7};
		Map<Integer,Integer> myMap = new HashMap<>();
		for(int value : myArray) {
			if(myMap.containsKey(value)!=true) {
				//Neu chua co thi put 
				myMap.put(value, 1);
			}else {
				//Neu co roi thi dem so lan xuat hien 
				int coutningStart = myMap.get(value);
				coutningStart++;
				myMap.put(value, coutningStart); 
			}
		}
		for(Map.Entry entryValue : myMap.entrySet()) {
			System.out.println(entryValue.getKey()+ "xuat hien " + entryValue.getValue());
		}
		
	}

}
