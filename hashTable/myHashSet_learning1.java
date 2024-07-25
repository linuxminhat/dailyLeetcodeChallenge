package hashTable;

import java.util.ArrayList;

public class myHashSet_learning1 {
	private int SIZE = 1000;
	private ArrayList<Integer>myBucket[];
	
	myHashSet_learning1(){
		myBucket = new ArrayList[SIZE];
		//tao ra do dai cua cai mang array list 
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
	}
	
	//return hash value
	private int hashFunction(int key) {
		return key%SIZE;
		//Tao ra noi luu tru buckety 
		
		
	}
	public void add(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		int keyIndex = bucket.indexOf(key);
		if(keyIndex<0) {
			bucket.add(key);
		}
		
	}
	public void remove(int key) {
		
	}
	public boolean contains(int key) {
		return false;
	}
	

}
