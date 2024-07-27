package hashTable;

import java.util.ArrayList;

public class myHashMap_review {
	class Data{
		int key;
		int value;
		Data(int key,int value){
			this.key=key;
			this.value=value;
		
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Data) {
				return key==((Data) obj).key;
			}
			return false;
		}
	}
	private static final int SIZE = 1000;
	ArrayList<Data> myBucket[];
	//implementing constructor 
	myHashMap_review(){
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
		int keyIndexValue = bucket.indexOf(tempData);//Boi vi chung ta can in ra {key:value}
		if(keyIndexValue>=0) {
			bucket.get(keyIndexValue).value=value;
		}else {
			bucket.add(tempData);
		}
	}
	public void remove(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data removedData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(removedData);
		if(keyIndexValue>=0) {
			bucket.remove(removedData);
		}else {
			return;
		}
	}
	public int get(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data gottenData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(gottenData);
		if(keyIndexValue>=0) {
			return bucket.get(keyIndexValue).key;
		}else {
			return -1;
		}
	}

}
