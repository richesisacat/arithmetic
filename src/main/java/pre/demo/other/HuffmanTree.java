package pre.demo.other;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 哈夫曼树.
 */
public class HuffmanTree {

    private Node root;

    public static void main(String[] args) {
        int[] weights = {2, 25, 7, 9, 18, 3};
        HuffmanTree huffmanTree = new HuffmanTree();
        huffmanTree.createHuffman(weights);
        huffmanTree.output(huffmanTree.root);
    }

    public void createHuffman(int[] weights) {
        // 优先队列用于辅助构建哈夫曼树
        Queue<Node> nodeQueue = new PriorityQueue<>();

        // 构建森林，初始化nodes数组
        for (int i = 0; i < weights.length; i++) {
            nodeQueue.add(new Node(weights[i]));
        }

        // 主循环，当结点队列只剩一个结点时结束
        while (nodeQueue.size() > 1) {
            // 从结点队列选择权值最小的两个结点
            Node left = nodeQueue.poll();
            Node right = nodeQueue.poll();

            // 创建新结点作为两结点的父节点
            Node parent = new Node(left.weight + right.weight, left, right);
            nodeQueue.add(parent);
        }

        root = nodeQueue.poll();
    }

    static class Node implements Comparable<Node> {

        int weight;

        Node lChild;

        Node rChild;

        public Node(int weight) {
            this.weight = weight;
        }

        public Node(int weight, Node lChild, Node rChild) {
            this.weight = weight;
            this.lChild = lChild;
            this.rChild = rChild;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public void output(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.weight);

        output(head.lChild);
        output(head.rChild);
    }

}
