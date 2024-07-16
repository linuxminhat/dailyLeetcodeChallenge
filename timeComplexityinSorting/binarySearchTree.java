package timeComplexityinSorting;

public class binarySearchTree {
	public static int binarySearchTree(int[] array,int findingValue) {
			int leftIndex=0;
			int rightIndex=array.length-1;
			while(leftIndex<=rightIndex) {
			int midIndex = (leftIndex+rightIndex)/2;
				if(findingValue == array[midIndex]) {
					return midIndex;
				}else {
					if(findingValue>array[midIndex]) {
						leftIndex=midIndex+1;
					}else {
						rightIndex=midIndex-1;
					}
				}
			}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,4,9,12,19,25,31,46,50,57,59};
		System.out.println(binarySearchTree(array,46));
	}

}
