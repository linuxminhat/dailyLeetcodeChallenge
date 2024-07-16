package advanced_Sorting;

import java.util.Arrays;

public class usingLibrary {
	public static int[] intArray = {3,2,1,0};
	public static void main(String[] args) {
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		//Sorting an String array 
		String[] stringArray = {"1","0000","22"};
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
	}
	

}
