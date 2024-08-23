
import java.util.LinkedList;
import java.util.Queue;

public class levelOrder2 {

    public static void main(String[] args) {

        Node n1 = new Node(14);
        Node n2 = new Node(18);
        Node n3 = new Node(19);
        Node n4 = new Node(3);
        Node n5 = new Node(4);
        Node n6 = new Node(140);
        Node n7 = new Node(10);

        n1.left = n2;
        n1.right = n3;

        n2.right = n4;

        n4.left = n7;

        n3.left = n5;
        n3.right = n6;

        // System.out.println("Root Note is " + n1.val);
        order(n1);

    }

    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
        }
    }

    public static void order(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            while (n > 0) {
                Node temp = q.remove();
                System.out.print(temp.val + " ");

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
                n--;
            }
            System.out.println();
        }

    }
}
