
public class sizeOfTheTree {

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
        
        int size = size(n1); 
        System.out.println("Size of the tree: " + size);
    }

    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int x) {
            val = x;
        }
    }

    public static int size(Node root){
        if (root == null) {
            return 0;
        }
        int x = size(root.left);
        int y = size(root.right);
        return x + y + 1;
    }

}
