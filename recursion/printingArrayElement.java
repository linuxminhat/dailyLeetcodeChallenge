package recursion;

public class printingArrayElement {
	public static void printingElement(int[] array, int index) {
		//bai toan co so 
		if(index<0 || index>=array.length) {
			return;
		}
		//Cong thuc quy nap 
		printingElement(array,index+1);
		System.out.println(array[index]);
		 
	}
	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		printingElement(array,0);
	}

}
