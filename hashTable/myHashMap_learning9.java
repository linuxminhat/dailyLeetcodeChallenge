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
	myHashMap_learning9(){;
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
		int hashIndexValue = hashFunction(key);
		var bucket = myBucket[hashIndexValue];
		Data tempData = new Data(key,value);
		int keyIndexValue = bucket.indexOf(tempData);
		if(keyIndexValue>=0) {
			bucket.get(keyIndexValue).value=value;
		}else {
			bucket.add(tempData);
		}
	}
	public void remove(int key) {
		int hashIndexValue = hashFunction(key);
		var bucket = myBucket[hashIndexValue];
		Data myDeletedData = new Data(key,0);
		bucket.remove(myDeletedData);
		
	}
	public int get(int key) {
		int hashIndexValue = hashFunction(key);
		var bucket = myBucket[hashIndexValue];
		Data myGetData = new Data(key,0);
		int keyIndexValue = bucket.indexOf(myGetData);
		if(keyIndexValue>=0) {
			return bucket.get(keyIndexValue).value;// tra ve value 
		}
		return -1;
	}
	public static void main(String[] args) {
		myHashMap_learning9 myMap = new myHashMap_learning9();
		myMap.put(1, 1);
		myMap.put(1, 2);
		myMap.put(10, 2);
		System.out.println("" + myMap.get(1));//value => 2 
		System.out.println("" + myMap.get(2));
		myMap.remove(1);
		System.out.println(""+myMap.get(1));
		System.out.println(""+myMap.get(10));
//		System.out.println(""+myMap.get(10));
		
	}

}
