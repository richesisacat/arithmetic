package pre.demo.structure;

import pre.demo.pojo.BinaryTree;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 二叉树遍历 广度优先.
 */
public class TreeBfs {

  public static void main(String[] args) {
    BinaryTree node = BinaryTree.init1();
    TreeBfs.bfs(node);
  }

  public static void bfs(BinaryTree node) {
    if (node != null) {
      Queue<BinaryTree> queue = new ArrayDeque<>();
      queue.offer(node);

      while (!queue.isEmpty()) {
        BinaryTree currentNode = queue.poll();

        System.out.print(currentNode.getData() + " ");

        if (currentNode.getLeft() != null) {
          queue.offer(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
          queue.offer(currentNode.getRight());
        }
      }
    }
  }
}
