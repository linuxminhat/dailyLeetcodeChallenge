package stackArray_review4;

public class imstackArray implements istackArray {
	int[] newArray;
	int SIZE;
	int topIndex;
	imstackArray(int size){
		SIZE=size;
		newArray=new int[SIZE];
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
			int value=newArray[topIndex];
			topIndex--;
			return value;
		}
		return -1;
	}

	@Override
	public boolean isFull() {
		return topIndex==SIZE;
	}

	@Override
	public boolean isEmpty() {
		return topIndex<0;
	}

	@Override
	public void printing() {
		if(isEmpty()) {
			System.out.println("This stack is empty ! ");
		}else {
			for(int i=0;i<=topIndex;i++) {
				System.out.println(newArray[i]);
			}
			System.out.println();
			
		}
		
	}
	

}
