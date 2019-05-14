package pre.demo.sort.insert;

/**
 * 直接插入排序.
 */
public class InsertSort {
  public static void main(String[] args) {
    int[] arr = {9, 10, 3, 5, 4, 6, 2, 8, 1, 7};
    sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void sort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int tmp = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > tmp) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = tmp;
    }
  }
}
