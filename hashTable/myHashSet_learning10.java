package hashTable;

import java.util.ArrayList;

public class myHashSet_learning10 {
	public final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	myHashSet_learning10(){
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
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		int keyIndex = bucket.indexOf(key);
		if(keyIndex<0) {
			bucket.add(key);
		}
	}
	public void removeFunction(int key) {
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		int keyIndex = bucket.indexOf(key);
		if(keyIndex>=0) {
			bucket.remove(keyIndex);
		}
	}
	public boolean checkingAvailable(int key) {
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		int keyIndex = bucket.indexOf(key);
		return keyIndex>=0;
	}
}
