package hashTable;

import java.util.ArrayList;

public class myHashMap_learning10 {
	
	
	public final int SIZE=1000;
	ArrayList<Data> myBucket[];
	//declare a constructor 
	class Data{
		int key;
		int value;
		Data(int key,int value){
			this.key=key;
			this.value=value;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Data){
				return key==((Data)obj).key;
			}else {
				return false;
			}
		}
	}
	//imeplementing constructor
	myHashMap_learning10(){
		myBucket = new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
	}
	//implementing all function
	public int hashFunction(int key) {
		return key%SIZE;
		
	}
	public void put(int key,int value) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data tempData = new Data(key,value);
		int keyIndexValue = bucket.indexOf(tempData);
		if(keyIndexValue>=0) {
			bucket.get(keyIndexValue).value=value;
		}else {
			bucket.add(tempData);
		}
		
	}
	public void remove(int key) {
		int hashValueIndex=hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data tempData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(tempData);
		if(keyIndexValue>=0) {
			bucket.remove(tempData);
		}else {
			return;
		}
		
		
	}
	public int get(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data getData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(getData);
		if(keyIndexValue>=0) {
			return bucket.get(keyIndexValue).value; //easy as a piece
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		myHashMap_learning10 newHashMap = new myHashMap_learning10();
		newHashMap.put(1, 1);
		newHashMap.put(1, 2);
		newHashMap.put(10,1);
		System.out.println("" + newHashMap.get(1));//value => 1
		System.out.println("" + newHashMap.get(2));
		System.out.println("" + newHashMap.get(10));
	}

}
