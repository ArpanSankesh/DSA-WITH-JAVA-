package linkedList;

public class printElements {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        print(head);
    }
    public static class Node {
        int val;
        Node next;

        Node(int v1) {
            val = v1;
            next = null;
        }
    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val );
            temp = temp.next;
        }
    }
}
