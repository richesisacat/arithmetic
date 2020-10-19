package pre.demo.sort;

import java.util.Arrays;

public class Mergesort {

    public static int[] mergeSort(int[] A, int n) {
        // write code here
        sort(A, 0, n - 1);
        return A;
    }

    public static void sort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            // 划分左右
            sort(data, left, middle);
            sort(data, middle + 1, right);
            // 合并左右
            merge(data, left, middle, right);
        }
    }

    // 合并左右两个子数组
    public static void merge(int[] data, int left, int middle, int right) {
        // 临时数组
        int[] tempArr = new int[right - left + 1];
        // 左边数组游标
        int leftIndex = left;
        // 右边数据游标
        int rightIndex = middle + 1;
        // 临时数组游标
        int tempIndex = 0;

        while (leftIndex <= middle && rightIndex <= right) {
            // 临时数组选取左、右子数组中小数值
            if (data[leftIndex] < data[rightIndex]) {
                tempArr[tempIndex++] = data[leftIndex++];
            } else {
                tempArr[tempIndex++] = data[rightIndex++];
            }
        }
        // 剩余的直接放入
        while (leftIndex <= middle) {
            tempArr[tempIndex++] = data[leftIndex++];
        }
        // 剩余的直接放入
        while (rightIndex <= right) {
            tempArr[tempIndex++] = data[rightIndex++];
        }
        // 将临时数组放回原数组相应位置
        int temp = 0;
        while ((temp + left) <= right) {
            data[left + temp] = tempArr[temp];
            temp++;
        }
    }

    public static void main(String[] args) {
        // Merge Sort是我们学习的第一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        // 注意：不要轻易尝试使用SelectionSort, InsertionSort或者BubbleSort处理100万级的数据
        // 否则，你就见识了O(n^2)的算法和O(nlogn)算法的本质差异：）
        int N = 1000000;
        int[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        mergeSort(arr, 100000);
        long n = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        long n1 = System.nanoTime();
        System.out.println((n1 - n)/ 1_000_000);
    }
}
