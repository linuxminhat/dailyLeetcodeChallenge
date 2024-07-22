package queueArray_learning;

public class myMain {
	public static void main(String[] args) {
		imqueueArray newQueue = new imqueueArray(3);
		newQueue.push(1);
		newQueue.push(2);
		newQueue.push(3);
		newQueue.show();
		
		newQueue.pop();
		newQueue.show();
		//testing push or not 
		System.out.println(newQueue.push(4));
		
	}

}
