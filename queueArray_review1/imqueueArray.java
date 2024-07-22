package queueArray_review1;

public class imqueueArray implements iqueueArray {
	int[] newArray;
	int SIZE;
	int headIndex;
	int tailIndex;
	imqueueArray(int size){
		SIZE=size;
		newArray = new int[SIZE];
		headIndex=tailIndex=-1;
	}

	@Override
	public boolean push(int value) {
		if(!isFull()) {
			if(isEmpty()) {
				headIndex++;
			}
			tailIndex++;
			newArray[tailIndex] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		int value=-1;
		if(!isEmpty()) {
			value=newArray[headIndex];
			headIndex++;
			if(headIndex>tailIndex) {
				headIndex=tailIndex=-1;
			}
		}
		 
		return value;
	}

	@Override
	public boolean isFull() {
		 return (tailIndex-1==SIZE);
	}

	@Override
	public boolean isEmpty() {
		return (headIndex==-1 && tailIndex==-1);
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This queue is empty");
		}else {
			for(int i=headIndex;i<=tailIndex;i++) {
				System.out.println(newArray[i]);
			}
			System.out.println();
		}
		
	}

	
}
