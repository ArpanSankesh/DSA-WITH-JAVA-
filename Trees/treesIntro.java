// package Trees;
public class treesIntro {

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.left = n2;
        n1.right = n3;

        System.out.println(n1.val);
        System.out.println(n1.left.val);
        System.out.println(n1.right.val);

    }

    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
        }
    }

}
