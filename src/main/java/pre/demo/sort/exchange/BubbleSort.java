package pre.demo.sort.exchange;

/**
 * 交换排序之——冒泡排序.
 *
 * 2019-05-04 优化，增加didSwap，将最好情况时间复杂度降为O(n)
 * @author Yang.Yu 2018/5/14 10:28
 */
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {9, 10, 3, 5, 4, 6, 2, 8, 1, 7};
    bsort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  private static void bsort(int[] arr) {
    boolean didSwap;

    for (int j = arr.length; j >= 0; j--) {
      didSwap = false;

      for (int i = 0; i < j - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int tmp;
          tmp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = tmp;
          didSwap = true;
        }
      }

      if (!didSwap) {
        return;
      }
    }
  }
}
