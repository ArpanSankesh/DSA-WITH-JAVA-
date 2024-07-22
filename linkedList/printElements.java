package linkedList;

public class printElements {
    public static void main(String[] args) {
        print(Node next);
    }
    public static class Node {
        int val;
        Node next;

        Node(int v1) {
            val = v1;
        }
    }

    public static void print(Node next){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}
