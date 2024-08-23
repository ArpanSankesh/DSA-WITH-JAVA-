
public  class treeTraversal{
    public static void main(String[] args) {

        Node n1 = new Node(14);
        Node n2 = new Node(18);
        Node n3 = new Node(19);
        Node n4 = new Node(7);
        Node n5 = new Node(3);
        Node n6 = new Node(10);
        Node n7 = new Node(8);
        Node n8 = new Node(4);
        Node n9 = new Node(15);

        n1.left = n2;
        n1.right = n3;
        
        n2.left = n4;
        n2.right = n5;

        n5.left = n6;

        n3.right = n7;

        n7.left = n8;
        n7.right = n9;

        traversal(n1);


    }

    public static class Node{
        int val;
        Node left;
        Node right;

        Node (int x){
            val = x;
        }
    } 

    public static void traversal(Node root){
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        traversal(root.left);
        traversal(root.right);
    }
}