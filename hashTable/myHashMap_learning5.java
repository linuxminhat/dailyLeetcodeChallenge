package hashTable;

import java.util.ArrayList;

public class myHashMap_learning5 {
	private final int SIZE=1000;
	//implementing a new data type 
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
				return key==(((Data)obj).key);
			}
			return false;
		}
	}
	
	ArrayList<Data> myBucket[];
	myHashMap_learning5(){
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
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data tempData = new Data(key,0);//Chua duoc luu trong bucket 
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
