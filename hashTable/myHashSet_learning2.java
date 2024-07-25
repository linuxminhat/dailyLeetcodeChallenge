package hashTable;

import java.util.ArrayList;

public class myHashSet_learning2 {
	private final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	
	myHashSet_learning2(){
		myBucket= new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i] = new ArrayList<>();
		}

	}
	public int hashFunction(int key) {
		return key%SIZE;
	}
	public void add(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket=myBucket[hashValueIndex];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue<0) {
			bucket.add(key);
		}
		
	}
	public void remove(int key) {
		
	}
	public boolean contains(int key) {
		
		return false;
	}

}
