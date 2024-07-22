package stackArray_review1;

import stackArray.stackArray;

public class stackArrayImplementing implements stackArray {

	private int[] newArray;
	public int topIndex;
	public int SIZE;
	stackArrayImplementing(int size){
		SIZE=size;
		newArray = new int[SIZE];
		topIndex=-1;
	}

	@Override
	public boolean push(int value) {
		if(!isFull()) {
			topIndex++;
			newArray[topIndex]=value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			int value = newArray[topIndex];
			topIndex--;//its mean it take the value 
			return value;
		}
		return -1;
	}

	@Override
	public boolean isFull() {
		return topIndex==SIZE-1;
	}

	@Override
	public boolean isEmpty() {
		return topIndex<0;
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This linked list is empty !");
		}else {
			for(int i=0;i<=topIndex;i++) {
				System.out.println(newArray[i]);
			}
			System.out.println();
		}
	 
		
	}

}
