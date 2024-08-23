
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class reverselevelOrder {

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
        List<Integer> ls = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Node temp = q.remove();
                ls.add(temp.val);

                if (temp.right != null) {
                    q.add(temp.right);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

            }
        }
        for (int i = ls.size() - 1; i >= 0; i--) {
            System.out.print(ls.get(i) + " ");
        }

    }
}
