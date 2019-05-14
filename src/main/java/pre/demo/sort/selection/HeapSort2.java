package pre.demo.sort.selection;

import java.util.Arrays;

public class HeapSort2 {
  /**
   * 下沉调整
   *
   * @param array       待调整的堆
   * @param index 要下沉的父节点
   * @param length      堆的有效大小
   */
  public static void downAdjust(int[] array, int index, int length) {
    // temp保存父节点值，用于最后的赋值
    int temp = array[index];
    int maxChild = 2 * index + 1;
    while (maxChild < length) {
      // 如果有右孩子，且右孩子大于左孩子的值，则定位到右孩子
      if (maxChild + 1 < length && array[maxChild + 1] > array[maxChild]) {
        maxChild++;
      }

      // 如果父节点大于任何一个孩子的值，直接跳出
      if (temp >= array[maxChild]) {
        break;
      }

      array[index] = array[maxChild];
      index = maxChild;
      maxChild = 2 * index + 1;
    }
    array[index] = temp;
  }

  public static void heapSort(int[] array) {

    // 1.把无序数组构建成二叉堆。
    // 完全二叉树，最后一个非叶子节点为 ((n-1)-1)/2=(n-2)/2
    for (int i = (array.length - 2) / 2; i >= 0; i--) {
      downAdjust(array, i, array.length);
    }

    System.out.println(Arrays.toString(array));

    // 2.循环删除堆顶元素，移到集合尾部，调节堆产生新的堆顶。
    for (int i = array.length - 1; i > 0; i--) {
      // 最后一个元素和第一元素进行交换
      int temp = array[i];
      array[i] = array[0];
      array[0] = temp;
      // 下沉调整最大堆
      downAdjust(array, 0, i);
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 0, 10};
    heapSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
