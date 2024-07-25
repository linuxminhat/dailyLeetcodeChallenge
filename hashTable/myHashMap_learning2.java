package hashTable;

import java.util.ArrayList;

public class myHashMap_learning2 {
	//Key : Value : 
	public final int SIZE=1000;
	public ArrayList<Data> myBucket[];
	
	private class Data{
		int key;
		int value;
		Data(int key,int value){
			this.key=key;
			this.value=value;
		}
		//So sanh giua 2 object thi so sanh key chu khong phai so sanh value 
		@Override
		public boolean equals(Object other) {
			 if(other instanceof Data) {
				 return this.key==((Data)other).key;
			 }
			 return false;
		 
		}
	}
	
	public myHashMap_learning2() {
		myBucket = new ArrayList[SIZE];
		for(int i=0;i<myBucket.length;i++) {
			myBucket[i]=new ArrayList<>();
		}
		
	}
	//implementing all needed function 
	
	public int hashFunction(int key) { 
		return key%SIZE;
	}
	
	public void put(int key,int value) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		Data objet = new Data(key,0);
		int keyValueIndex=bucket.indexOf(objet);
		if(keyValueIndex>0) {
			(bucket.get(keyValueIndex)).value=value;
		}else {
			bucket.add(objet);
		}
		
	}
	
	public void remove(int key) {
		
	}
	
	public int get(int key) {
		return 0;
	}
	

}
