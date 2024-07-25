package hashTable;

import java.util.ArrayList;

public class myHashSet_learning7 {
	public final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	//declare constructor 
	myHashSet_learning7(){
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
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue<0) {
			bucket.add(key);
		}
	}
	public void removeFunction(int key) {
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue>=0) {
			bucket.remove(keyIndexValue);
		}	
	}
	public boolean chekingAvailable(int key) {
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		int keyIndexValue = bucket.indexOf(key);
		return keyIndexValue>=0;
	}

}
