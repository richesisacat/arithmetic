package pre.demo.leecode;

import java.util.Arrays;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 说明：
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions/xmi2l7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Merge {

    public static void main(String[] args) {
        /*int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        operation(nums1, 1, nums2, 5);*/
        int[] nums1 = {0};
        int[] nums2 = {2};
        operation(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void operation(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            int tmp = nums2[i];
            int idx = i + m;
            while (idx > 0 && nums1[idx - 1] > tmp) {
                nums1[idx] = nums1[idx - 1];
                idx--;
            }
            nums1[idx] = tmp;
        }
    }
}
