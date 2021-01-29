package pre.demo.leecode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args) {
        int[][] arrays = {
          {1, 2, 3, 4},
          {10, 11, 12, 5},
          {9, 8, 7, 6},
        };
        System.out.println(sort(arrays));
    }

    public static List<Integer> sort(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        if (matrix.length <= 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;

        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order.add(matrix[top][column]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                order.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column >= left; column--) {
                    order.add(matrix[bottom][column]);
                }
                for (int row = bottom - 1; row > top; row--) {
                    order.add(matrix[row][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return order;
    }


/*
00 01 02右+
12 22左+
21 20右-
10左-
11右+
*/
}
