package stackArray_review5;

public class myMain {
	public static void main(String[] args) {
		mystackArray myArray = new mystackArray(5);
		myArray.push(1);
		myArray.push(2);
		myArray.push(3);
		myArray.push(4);
		myArray.push(5);
		//printing 
		myArray.printing();
		myArray.pop();
		myArray.printing();
		myArray.isEmpty();
		
		System.out.println(myArray.isEmpty());
		myArray.pop();
		myArray.pop();
		myArray.pop();
		myArray.printing();
	}

}
