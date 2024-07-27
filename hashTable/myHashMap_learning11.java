package hashTable;

import java.util.ArrayList;

public class myHashMap_learning11 {
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
				return key==((Data)obj).key;
			}
			return false;
		}
	}
	private static final int SIZE = 1000;
	ArrayList<Data> myBucket[];
	
	myHashMap_learning11(){
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
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		Data putData = new Data(key,value);
		int keyValueIndex=bucket.indexOf(putData);
		if(keyValueIndex>=0) {
			bucket.get(keyValueIndex).value=value;
		}else {
			bucket.add(putData);
		}
	}
	public void remove(int key) {
		int hashKeyValue = hashFunction(key);
		var bucket = myBucket[hashKeyValue];
		Data removedData = new Data(key,0);
		int keyValueIndex = bucket.indexOf(removedData);
		if(keyValueIndex>=0) {
			bucket.remove(removedData);
		}else {
			return;
		}
		
	}
	public int get(int key) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data gottenData = new Data(key,0);
		int keyValueIndex = bucket.indexOf(gottenData);
		if(keyValueIndex>=0) {
			return bucket.get(keyValueIndex).value;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		myHashMap_learning11 testing = new myHashMap_learning11();
		testing.put(1,1);
		testing.put(1,2);
		testing.put(1,3);
		testing.put(10,1);
		System.out.println(""+testing.get(10));
	}
	

}
