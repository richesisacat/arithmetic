package pre.demo.leecode;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 *
 * <p>找出那个只出现了一次的元素。<p/>
 *
 * <p>说明： 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？</p>
 */
public class SingleNumber {
  public static void main(String[] args) {
    int[] nums = {4, 1, 2, 1, 2};
    System.out.println(operation(nums));
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  /**
   * 1、非空 2、其余均两次
   */
  public static int operation(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[0] = nums[0] ^ nums[i];
    }
    return nums[0];
  }
}
