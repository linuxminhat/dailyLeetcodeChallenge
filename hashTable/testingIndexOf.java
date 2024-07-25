package hashTable;

import java.util.ArrayList;
import java.util.Arrays;

public class testingIndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> testingBucket = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 28));

        // In ra toàn bộ danh sách
        System.out.println("List: " + testingBucket);

        // Tìm chỉ số của phần tử 3
        int index = testingBucket.indexOf(3);

        // In ra chỉ số
        System.out.println("Index of 3: " + index); // Sẽ in ra 2
    }
}
