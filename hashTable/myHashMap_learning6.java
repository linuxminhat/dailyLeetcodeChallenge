package hashTable;

import java.util.ArrayList;

public class myHashMap_learning6 {
	private static final int SIZE = 1000;
	ArrayList<Data> myBucket[];
	public class Data{
		int key;
		int value;
		Data(int key,int value){
			this.key=key;
			this.value=value;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Data) {
				return key==((Data)obj).value;
				
			}
			return false;
		}
	}
	myHashMap_learning6(){
		myBucket=new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]= new ArrayList<>();
		}
	}
	//implementing all needed function 
	public int hashFunction(int key) {
		return key%SIZE;
		
	}
	public void put(int key,int value) {
		int hashValueIndex = hashFunction(key);
		var bucket = myBucket[hashValueIndex];
		Data tempData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(tempData);
		if(keyIndexValue>=0) {
			bucket.get(keyIndexValue).value=value;
		}else {
			bucket.add(tempData);
			//bucket.add(key)=> cant
			
		}
	}
	public void remove(int key) {
		
	}
	public int get(int key) {
		return 0;
	}

}
