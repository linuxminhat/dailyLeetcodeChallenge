package hashTable;

import java.util.ArrayList;

public class myHashSet_learning6 {
	public final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	//declare a constructor 
	myHashSet_learning6(){
		myBucket = new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
	}
	
	//implementing all function 
	public int hashFunction(int key) {
		return key%SIZE;
	}
	
	public void addFunction(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue<0) {
			bucket.add(key);
		}
	}
	public void removeFunction(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue>0) {
			bucket.remove(keyIndexValue);
		}
	}
}
