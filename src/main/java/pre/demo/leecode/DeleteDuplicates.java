package pre.demo.leecode;

/**
 * 删除排序链表中的重复元素.
 *
 * <p>给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次.</p>
 *
 * <p>https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/description/</p>
 */
public class DeleteDuplicates {
  public static void main(String[] args) {
    // 1->1->2->3->3

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(1);
    ListNode n3 = new ListNode(2);
    ListNode n4 = new ListNode(3);
    ListNode n5 = new ListNode(3);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    doDeleteDuplicates(n1);
    ListNode head = n1;
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }

  public static ListNode doDeleteDuplicates(ListNode head) {
    ListNode tmp = head;
    while (tmp != null && tmp.next != null) {
      if (tmp.val == tmp.next.val) {
        tmp.next = tmp.next.next;
      } else {
        tmp = tmp.next;
      }
    }
    return head;
  }
}
