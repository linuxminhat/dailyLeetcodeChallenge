package hashTable;
import java.util.ArrayList;

public class myHashSet_learning8 {
	public final int SIZE=1000;
	ArrayList<Integer> myBucket[];
	
	//implementing all needed function 
	public int hashFunction(int key) {
		return key%SIZE;
	}
	public void addFunction(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue<0) {
			bucket.add(key);
		}
	}
	public void removeFunction(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndexValue = bucket.indexOf(key);
		if(keyIndexValue>=0) {
			bucket.remove(keyIndexValue);
		}
	}
	public boolean checkingContains(int key) {
		int hashValue = hashFunction(key);
		var bucket = myBucket[hashValue];
		int keyIndex = bucket.indexOf(key);
		return keyIndex>=0;
		
	}

}
