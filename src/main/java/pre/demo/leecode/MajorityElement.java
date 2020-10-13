package pre.demo.leecode;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。
 * <p>
 * 多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 解：
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(operation(nums));
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int operation(int[] nums) {
        int length = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int size = 0;
            for (int j = i, k = nums[i]; j < nums.length; j++) {
                if (k == nums[j]) {
                    size++;
                }
            }
            if (size > length) {
                return nums[i];
            }
        }
        return 0;
    }
}
