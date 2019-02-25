package pre.demo.sort.selection;

/**
 * 选择排序之——简单选择排序
 *
 * @author Yang.Yu 2018/5/14 13:40
 */
public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {9, 10, 3, 5, 4, 6, 2, 8, 1, 7};
    sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void sort(int[] arr) {
    int tmp;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
  }
}
