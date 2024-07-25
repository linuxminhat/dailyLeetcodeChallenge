package hashTable;

import java.util.ArrayList;

public class myHashSet_learning4 {
	//implementing all needed function 
	public final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	myHashSet_learning4(){
		myBucket = new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]= new ArrayList<>();;
		}
	}
	public int hashFunction(int key) {
		return key%SIZE;
	}
	public void add(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];//bucket is a list to save all valuable
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue<0) {
			bucket.add(key);
		}
		
	}
	public void remove(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndex = bucket.indexOf(key);
		if(keyIndex>=0) {
			bucket.remove(keyIndex);
//			bucket.remove(key);error
		}
		
	}
	public boolean checkingAvailable(int key) {
		return false;
	}
	

}
