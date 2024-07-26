package hashTable;

import java.util.ArrayList;

public class myHashMap_learning4 {
	//creating a new data type 
	private class Data{
		int key;
		int value;
		//declare constructor of Data 
		Data(int key,int value){
			this.key=key;
			this.value=value;
		}
		@Override
		public boolean equals(Object other) {
			 if(other instanceof Data) {
				 return this.key==((Data)other).key;//checking key
			 }
			 return false;
		}
	}
	public final int SIZE=1000;
	ArrayList<Data> newBucket[];
	
	//declare constructor 
	myHashMap_learning4(){
		newBucket = new ArrayList[SIZE];
		for(int i=0;i<newBucket.length;i++) {
			newBucket[i]=new ArrayList<>();
		}
	}
	
	//implementing all needed function 
	public int hashFunction(int key) {
		return key%SIZE;
	}
	public void put(int key,int value) {
		int hashValueIndex = hashFunction(key);
		var bucket = newBucket[hashValueIndex];
		Data temp = new Data(key,0);//chung key thi so sanh duoc 
		int keyIndex = bucket.indexOf(temp);
		if(keyIndex>0) {
			bucket.get(keyIndex).value=value;//updating value 
			
		}else {
			bucket.add(temp); 
		}
		
		
		
		
	}
	public void remove(int key) {
		
	}
	public int get(int key) {
		return 0;
		//expected return value : the number of containing 
	}
	public static void main(String[] args) {
		
	}
}
