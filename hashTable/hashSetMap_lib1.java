package hashTable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSetMap_lib1 {
	public static void main(String[] args) {
//		Set<Integer> myIntSet = new HashSet<>();
//		myIntSet.add(1);
//		myIntSet.add(2);
//		myIntSet.add(3);
//		myIntSet.add(4);
//		myIntSet.add(1);
//		myIntSet.add(3);
//		for(Integer valueInt : myIntSet) {
//			System.out.println(valueInt);
//		}
//		//Khong lien quan den thu tu 
//		Set<String> myStringSet = new HashSet<>();
//		myStringSet.add("1");
//		myStringSet.add("2");
//		myStringSet.add("3");
//		myStringSet.add("2");
//		for(String stringValue : myStringSet) {
//			System.out.println(stringValue);
//		}
		//Theo thu tu 
		Set<Integer> myIntValue = new TreeSet<>();
		myIntValue.add(1);
		myIntValue.add(2);
		myIntValue.add(3);
		myIntValue.add(4);
		myIntValue.add(3);
		for(Integer integer : myIntValue) {
			System.out.println(integer);
		}
	}

}
