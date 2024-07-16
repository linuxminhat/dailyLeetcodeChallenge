package advanced_Sorting;

import java.util.Arrays;

public class usingSortingLibrary {
	static class Student{
		int age;
		String name;
		public Student(String name,int age) {
			this.name=name;
			this.age=age;
		}
	}
	public static int[] array = {12,324,3,10,92,1000};
	public static void main(String[] args) {
		//Sorting an integer array 
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		//Sorting an String array 
		String[] stringArray = {"121","23","1000","00000"};
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		//Sorting a Student array with interface comparable 
		Student[] students = {new Student("Minh",10)};
		

	}

}
