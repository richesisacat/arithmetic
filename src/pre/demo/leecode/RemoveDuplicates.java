package pre.demo.leecode;

/**
 * 从排序数组中删除重复项.
 *
 * <p>给定一个排序数组，你需要在原地删除重复出现的元素,使得每个元素只出现一次，返回移除后数组的新长度。</p>
 *
 * <p>你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。</p>
 */
public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3};
    System.out.println(operation(nums));
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  /**
   * index为游标 指定当前坑 ，将后面不同前面的数填入坑中，并index后移继续寻找
   */
  public static int operation(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int index = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }

}
