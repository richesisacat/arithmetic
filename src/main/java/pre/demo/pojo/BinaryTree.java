package pre.demo.pojo;

public class BinaryTree {

  private BinaryTree left;

  private BinaryTree right;

  private String data;

  public BinaryTree(BinaryTree left, BinaryTree right, String data) {
    this.left = left;
    this.right = right;
    this.data = data;
  }

  public BinaryTree(String data) {
    this(null, null, data);
  }

  public void insertLeft(BinaryTree node, String value) {
    if (node.getLeft() == null) {
      node.setLeft(new BinaryTree(value));
    } else {
      BinaryTree newNode = new BinaryTree(value);
      newNode.setLeft(node.getLeft());
      node.setLeft(newNode);
    }
  }

  public void insertRight(BinaryTree node, String value) {
    if (node.getRight() == null) {
      node.setRight(new BinaryTree(value));
    } else {
      BinaryTree newNode = new BinaryTree(value);
      newNode.setRight(node.getLeft());
      node.setRight(newNode);
    }
  }

  public static BinaryTree init1() {
    BinaryTree node1 = new BinaryTree("1");
    node1.insertLeft(node1, "2");
    node1.insertRight(node1, "5");

    BinaryTree node2 = node1.getLeft();
    node2.insertLeft(node2, "3");
    node2.insertRight(node2, "4");

    BinaryTree node5 = node1.getRight();
    node5.insertLeft(node5, "6");
    node5.insertRight(node5, "7");
    return node1;
  }

  public BinaryTree getLeft() {
    return left;
  }

  public void setLeft(BinaryTree left) {
    this.left = left;
  }

  public BinaryTree getRight() {
    return right;
  }

  public void setRight(BinaryTree right) {
    this.right = right;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
