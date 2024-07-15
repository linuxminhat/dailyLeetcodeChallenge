package advanced_Sorting;

import java.util.Arrays;

public class mergeSorting_review5 {
	// triển khai hàm merge
	public static int[] mergeFunction(int[] array1, int[] array2) {
		int n = array1.length + array2.length;
		int[] newArray = new int[n];
		int i = 0;
		int i1 = 0;
		int i2 = 0;
		while (i < n) {
			if (i1 < array1.length && i2 < array2.length) {
				if (array1[i1] <= array2[i2]) {
					newArray[i] = array1[i1];
					i++;
					i1++;
				} else {
					newArray[i] = array2[i2];
					i++;
					i2++;
				}
			} else {
				if (i1 < array1.length) {
					newArray[i] = array1[i1];
					i++;
					i1++;
				} else {
					newArray[i] = array2[i2];
					i++;
					i2++;
				}
			}
		}
		return newArray;
	}

	public static int[] mergeSorting(int[] array, int L, int R) {
		if (L >= R) { // Điều kiện dừng đúng
			return new int[]{array[L]};
		}
		int M = (L + R) / 2;
		int[] array1 = mergeSorting(array, L, M);
		int[] array2 = mergeSorting(array, M + 1, R);
		return mergeFunction(array1, array2);
	}

	public static void main(String[] args) {
		int[] array = {4, 23, 1, 6, 24, 120, 23, 342, 12121};
		System.out.println(Arrays.toString(mergeSorting(array, 0, array.length - 1))); // Chỉ số đúng để bao phủ toàn bộ mảng
	}
}
