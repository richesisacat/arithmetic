package pre.demo.structure;

import pre.demo.pojo.BinaryTree;

/**
 * 二叉树 深度优先
 */
public class TreeDfs {

  public static void main(String[] args) {
    BinaryTree node = BinaryTree.init1();
    TreeDfs.left(node);
  }

  public static void left(BinaryTree node) {

    if (node != null) {
      System.out.print(node.getData() + " ");
      if (node.getLeft() != null) {
        left(node.getLeft());
      }

      if (node.getRight() != null) {
        left(node.getRight());
      }
    }
  }

}
