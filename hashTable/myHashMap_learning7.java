package hashTable;

import java.util.ArrayList;

public class myHashMap_learning7 {
	private static final int SIZE = 1000;
	ArrayList<Data> myBucket[];
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
	myHashMap_learning7(){
		myBucket=new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
	}
	//implementing all needed function 
	public int hashFunction(int key) {
		return key%SIZE;
		
	}
	public void put(int key,int value) {
		int hashKeyValue = hashFunction(value);
		var bucket = myBucket[hashKeyValue];
//		int keyIndexValue = bucket.indexOf(key); => Not true 
		Data tempData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(tempData);
		if(keyIndexValue>=0) {
			bucket.get(keyIndexValue).value=value;
		}else {
			bucket.add(tempData);
		}
	}
	public void remove(int key) {
		
	}
	public int get(int key) {
		return 0;
	}

}
