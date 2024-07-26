package hashTable;

import java.util.ArrayList;

public class myHashMap_learning9 {
	
	private static final int SIZE = 1000;
	ArrayList<Data> myBucket[];
	//implementing new data type 
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
	

	//implementing all needed function 
	public int hashFunction(int key) {
		return key%SIZE;
	}
	public void put(int key,int value) {
		int hashIndexValue = hashFunction(key);
		var bucket = myBucket[hashIndexValue];
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
