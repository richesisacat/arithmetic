package pre.demo.structure;


import pre.demo.pojo.Node;

/**
 * 链表反转
 *
 * @author Yang.Yu 2018/5/4 9:14
 */
public class NodeReverse {
  public static void main(String[] args) {
    final Node head = new Node(0);
    final Node node1 = new Node(1);
    final Node node2 = new Node(2);
    final Node node3 = new Node(3);

    head.setNext(node1);
    node1.setNext(node2);
    node2.setNext(node3);

    // 打印反转前的链表
    Node h = head;
    while (null != h) {
      System.out.print(h.getData() + " ");
      h = h.getNext();
    }
    System.out.println(" ");
    Node after = reverse1(head);
    while (null != after) {
      System.out.print(after.getData() + " ");
      after = after.getNext();
    }
  }

  public static Node reverse(final Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node pre = null;
    Node cur = head;
    while (cur != null) {
      Node tmp = cur.getNext();
      cur.setNext(pre);
      pre = cur;
      cur = tmp;
    }
    return pre;
  }

  public static Node reverse1(final Node head) {
    if (head == null || head.getNext() == null) {
      return head;
    }
    Node newHead = reverse1(head.getNext());
    head.getNext().setNext(head);
    head.setNext(null);
    return newHead;
  }
}
