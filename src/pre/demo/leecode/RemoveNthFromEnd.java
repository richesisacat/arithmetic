package pre.demo.leecode;

/**
 * 删除链表的倒数第N个节点.
 *
 * <p>给定一个链表: 1->2->3->4->5, 和 n = 2.</p>
 *
 * <p>当删除了倒数第二个节点后，链表变为 1->2->3->5.</p>
 *
 * <p>https://leetcode-cn.com/problems/remove-nth-ListNode-from-end-of-list/description/</p>
 */
public class RemoveNthFromEnd {
  public static void main(String[] args) {

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    ListNode head = remove(n1,1,0);//;doRemoveNthFromEnd(n1, 1);

    System.out.println(" ");
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }
  }

  public static ListNode doRemoveNthFromEnd(ListNode head, int n) {
    ListNode fast = head;
    ListNode slow = head;
    for (int i = 0; i < n; i++) {
      fast = fast.next;
    }
    if (fast == null) {
      head = head.next;
      slow.next = null;
      return head;
    }
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
  }

  public static ListNode remove(ListNode head, int n, int m) {
    if (head != null) {
      remove(head.next, n + 1, m + 1);
      System.out.print(head.val + " ");
      /*if ( == -1) {
        head.next = head.next.next;
        System.out.print("(<-)");
      }*/
      return head;
    }
    return null;
  }
}