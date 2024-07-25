package hashTable;

import java.util.ArrayList;

public class myHashSet {
	private final int size = 1000;
	private ArrayList<Integer> myBucket[];
	
	myHashSet(){
		myBucket = new ArrayList[size];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
		
	}
	//implementing a hash function
	private int hashFunction(int key) {
		
		return key % size; 
	}
	//implementing add function 
	public void add(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];	
		int keyIndex=bucket.indexOf(key);
		if(keyIndex<0) {
			bucket.add(key);
		}
	}
	
	public void removew(int key) {
		
	}
	public boolean contains(int key) {
		return false;
	}
	public static void main(String[] args) {
		myHashSet mySet = new myHashSet();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
	}
}
