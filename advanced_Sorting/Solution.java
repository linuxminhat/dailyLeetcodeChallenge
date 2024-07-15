package advanced_Sorting;

class Solution {
	//implementing merge function 
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

    // Implementing merge sort
    public static int[] sortingArray(int[] nums, int L, int R) {
        if (L < R) {
            int M = (L + R) / 2;
            int[] array1 = new int[M - L + 1]; // Phần mảng con từ L đến M
            int[] array2 = new int[R - M];     // Phần mảng con từ M + 1 đến R

            // Sao chép dữ liệu từ nums vào array1 và array2
            System.arraycopy(nums, L, array1, 0, M - L + 1);
            System.arraycopy(nums, M + 1, array2, 0, R - M);

            // Đệ quy sắp xếp các mảng con
            array1 = sortingArray(array1, 0, array1.length - 1);
            array2 = sortingArray(array2, 0, array2.length - 1);

            // Hợp nhất hai mảng con đã sắp xếp
            int[] mergedArray = mergeFunction(array1, array2);
            return mergedArray;
        }
        return new int[]{nums[L]}; // Trường hợp L == R, mảng chỉ có một phần tử
    }

    // Wrapper method để sắp xếp mảng nums từ 0 đến nums.length - 1
    public int[] sortArray(int[] nums) {
        return sortingArray(nums, 0, nums.length - 1);
    }
}