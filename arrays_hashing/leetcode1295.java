package arrays_hashing;

public class leetcode1295 {
	//prob : find numbers with Even Number of Digits 
	//Given an array nums of integers, return how many of them contain an even number of digits.
	/*
	 * Input: nums = [12,345,2,6,7896]
	   Output: 2
	 */
	public static int findingNumbersWithEvenDigits(int[] array) {
		int main_count=0;
		for(int element : array ) {
			if(checkingEvenNumberofDigits(element)==true) {
				main_count++;
			}
		}
		return main_count;
	}

	private static boolean checkingEvenNumberofDigits(int number) {
		int count=0;
		while(number>0) {
			count++;
			int digits = number%10;
			number/=10;
		}
		if(count%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array= {12,223,4444,54,2,1234};//expected -> 4 
		System.out.println(findingNumbersWithEvenDigits(array));
	}

}
