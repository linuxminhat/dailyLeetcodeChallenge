package binarySearch;

public class leetcode74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		for(int indexRow=0;indexRow<matrix.length;indexRow++) {
			for(int indexCol=0;indexCol<matrix[0].length;indexCol++) {
					if(target == matrix[indexRow][indexCol]) {
						return true;
					}
			}
		
		}
			return false;
        
    }

}
