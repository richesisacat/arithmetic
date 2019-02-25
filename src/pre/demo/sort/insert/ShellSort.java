package pre.demo.sort.insert;

public class ShellSort {

  public static void main(String[] args) {
    int[] arr = {9, 10, 3, 5, 4, 6, 2, 8, 1, 7};
    sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void sort(int[] arr) {
    //增量gap，并逐步缩小增量
    for (int gap = arr.length / 2; gap > 0; gap /= 2) {
      //从第gap个元素，逐个对其所在组进行直接插入排序操作
      for (int i = gap; i < arr.length; i++) {
        int j = i;
        int temp = arr[j];
        if (arr[j] < arr[j - gap]) {
          while (j - gap >= 0 && temp < arr[j - gap]) {
            //移动法
            arr[j] = arr[j - gap];
            j -= gap;
          }
          arr[j] = temp;
        }
      }
    }
  }
}
