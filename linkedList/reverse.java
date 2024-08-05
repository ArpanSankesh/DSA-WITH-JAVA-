package linkedList;

public class reverse {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        reversing(head);
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

    public static Node reversing(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node curr1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr1;
        }
        return prev;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
