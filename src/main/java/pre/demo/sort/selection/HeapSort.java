package pre.demo.sort.selection;

import pre.demo.ArrayUtil;

public class HeapSort {
  public static void main(String[] args) {
    int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3};
    heapSort(array);
    ArrayUtil.print(array);
  }

  public static void heapSort(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }

    // 先构建大顶堆
    buildMaxHeap(array);

    for (int i = array.length - 1; i >= 1; i--) {
      exchangeElements(array, 0, i);
      maxHeap(array, i, 0);
    }
  }

  private static void buildMaxHeap(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }

    // 最后一个非叶子节点
    for (int i = (array.length - 2) / 2; i >= 0; i--) {
      maxHeap(array, array.length, i);
    }
  }

  /**
   * 沉降法.
   *
   * <p>假设一个元素的两个子节点都满足最大堆的性质(左右子树都是最大堆)，</p>
   *
   * <p>只有跟元素可能违反最大堆性质，那么把该元素以及左右子节点的最大元素找出来，</p>
   *
   * <p>如果该元素已经最大，那么整棵树都是最大堆，程序退出，否则交换跟元素与最大元素的位置，</p>
   *
   * <p>继续调用maxHeap原最大元素所在的子树</p>
   */
  private static void maxHeap(int[] array, int heapSize, int index) {
    //假设index是叶节点就不用进行调整
    if (index <= heapSize / 2) {

      int left = index * 2 + 1;
      int right = index * 2 + 2;
      int max = index;

      if (left < heapSize && array[left] > array[index]) {
        max = left;
      }

      if (right < heapSize && array[right] > array[max]) {
        max = right;
      }

      if (index != max) {
        exchangeElements(array, index, max);
        maxHeap(array, heapSize, max);
      }
    }
  }

  private static void exchangeElements(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
