package pre.demo.other;

/**
 * 二分查找.
 */
public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(search(arr, 5, 0, arr.length - 1));
  }

  public static int search(int[] arr, int target, int low, int high) {
    if (arr[low] > target || target > arr[high] || low > high) {
      return -1;
    }

    int middle = (low + high) / 2;
    if (arr[middle] > target) {
      return search(arr, target, low, high - 1);
    } else if (arr[middle] < target) {
      return search(arr, target, low + 1, high);
    } else {
      return middle;
    }
  }
}
