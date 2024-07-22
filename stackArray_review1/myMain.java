package stackArray_review1;

public class myMain {
	public static void main(String[] args) {
		stackArrayImplementing newArray = new stackArrayImplementing(6);
		newArray.push(1);
		newArray.push(2);
		newArray.push(3);
		newArray.push(4);
		newArray.push(5);
		newArray.push(6);
		newArray.printing();
		newArray.pop();
		newArray.printing();
	}

}
