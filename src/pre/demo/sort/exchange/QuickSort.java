package pre.demo.sort.exchange;

/**
 * 交换排序之——快速排序.
 * @author Yang.Yu 2018/5/14 10:29
 */
public class QuickSort {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5, 4, 6, 2, 8, 9, 7};
    qsort(arr, 0, arr.length - 1);

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  private static void qsort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);        //将数组分为两部分
      qsort(arr, low, pivot - 1);                   //递归排序左子数组
      qsort(arr, pivot + 1, high);                  //递归排序右子数组
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];     //枢轴记录
    while (low < high) {
      while (low < high && arr[high] >= pivot) {
        high--;
      }
      arr[low] = arr[high];             //交换比枢轴小的记录到左端
      while (low < high && arr[low] <= pivot) {
        low++;
      }
      arr[high] = arr[low];           //交换比枢轴小的记录到右端
    }
    //扫描完成，枢轴到位
    arr[low] = pivot;
    //返回的是枢轴的位置
    return low;
  }
}
