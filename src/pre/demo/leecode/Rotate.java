package pre.demo.leecode;

public class Rotate {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 3;
    operation2(nums, k);
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  public static void operation1(int[] nums, int k) {

    if (nums.length <= 1) {
      return;
    }

    for (int j = 0 ; j < k ; j++) {
      int before = nums[0];

      for (int i = 1; i < nums.length; i++) {
        int tmp = nums[i];
        nums[i] = before;
        before = tmp;
      }
      nums[0] = before;
    }
  }

  public static void operation2(int[] nums, int k) {

    if (nums.length <= 1) {
      return;
    }

    int temp;

    while (k > 0) {
      temp = nums[nums.length - 1];
      for (int i = nums.length - 1; i > 0; i--) {
        nums[i] = nums[i - 1];
      }
      nums[0] = temp;
      k--;
    }
  }

}
