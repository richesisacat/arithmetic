package pre.demo.other;

/**
 * 数组实现定长队列
 */
public class UsingArrayRealizeQueue {

  private int[] queue = new int[3];
  private  int size = 0;
  private int start = 0;
  private int end = 0;

  public void put(int value) {
    if (size >= queue.length) {
      System.out.println("队列满");
      return;
    }

    queue[end++] = value;
    size++;
    if (end == queue.length) {
      end = 0;
    }
  }

  public int poll() {
    if (size <= 0) {
      System.out.println("队列空");
      return -999;
    }

    if (start == queue.length) {
      start = 0;
    }
    size--;
    return queue[start++];
  }

  public void print() {
    StringBuilder queueString = new StringBuilder();
    for (int i : queue) {
      queueString.append(i).append(" ");
    }
    System.out.println(queueString.toString());
  }

  public static void main(String[] args) {
    UsingArrayRealizeQueue queue = new UsingArrayRealizeQueue();
    queue.put(1);
    queue.put(2);
    queue.put(3);
    queue.print();

    queue.put(4);
    System.out.println(queue.poll());
    queue.print();
    queue.put(4);
    queue.print();
    System.out.println(queue.poll());

  }
}
