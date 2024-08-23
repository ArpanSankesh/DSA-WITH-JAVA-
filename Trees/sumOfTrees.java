public class sumOfTrees {
    public static void main(String[] args) {

        Node n1 = new Node(14);
        Node n2 = new Node(18);
        Node n3 = new Node(19);
        Node n4 = new Node(3);
        Node n5 = new Node(10);
        Node n6 = new Node(4);

        n1.left = n2;
        n1.right = n3;

        n2.right = n4;

        n4.left = n5;

        n3.left = n6;
        
        System.out.println("Root Note is " + n1.val);
        
        int sum = sum(n1); 
        System.out.println("Sum of the tree: " + sum);
    }

    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
        }
    }

    public static int sum(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.val;
    }
}
