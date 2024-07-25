package hashTable;

import java.util.ArrayList;

public class myHashSet_learning5 {
	public final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	myHashSet_learning5(){
		myBucket = new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
	}
	
	//implementing all function that needed
	public int hashFunction(int key) {
		return key%SIZE;
	}
	public void add(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue<0) {
			bucket.add(key);
		}
	}
	public void remove(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue>0) {
			bucket.remove(keyIndexValue);
		}
	}
	public boolean contains(int key) {
		return false;
	}
}
