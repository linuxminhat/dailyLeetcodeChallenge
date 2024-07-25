package hashTable;

import java.util.ArrayList;

public class myHashSet_learning9 {
	private final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	//declare constructor 
	myHashSet_learning9(){
		myBucket = new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
	}
	//implementing all needed function 
	public int hashFunction(int key) {
		return key%SIZE;
		
	}
	public void addFunction(int key) {
		int hashKey = hashFunction(key);
		var bucket = myBucket[hashKey];
		int keyValueIndex = bucket.indexOf(key);
		if(keyValueIndex<0) {
			bucket.add(key);
		}
		
	}
	public void removeFunction(int key) {
		int hashKey = hashFunction(key);
		var bucket = myBucket[hashKey];
		int keyValueIndex = bucket.indexOf(key);
		if(keyValueIndex>=0) {
			bucket.remove(keyValueIndex);
	
		}
	}
	public boolean checkingContains(int key) {
		int hashKey = hashFunction(key);
		var bucket = myBucket[hashKey];
		int keyValueIndex=bucket.indexOf(key);
		return keyValueIndex>=0;
	
	}

}
