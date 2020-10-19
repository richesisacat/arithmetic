package pre.demo.leecode;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xm77tm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * 解：
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 3, 3, 3, 2};
        System.out.println(operation(nums));
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int operation(int[] nums) {
        Integer target = null;
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (size == 0) {
                target = nums[i];
            }
            if (target != nums[i]) {
                size--;
            } else {
                size++;
            }
        }
        /*int length = nums.length / 2;
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
        }*/
        return target;
    }
}
