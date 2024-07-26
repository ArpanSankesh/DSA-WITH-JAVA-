
package linkedList;

import java.util.Scanner;

public class printElemLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        // head.next = new Node(20);
        // head.next.next = new Node(30);
        // head.next.next.next = new Node(40);
        // head.next.next.next.next = new Node(50);

        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Element " + i + " : ");
            int v = sc.nextInt();
            insert(head, v);
        }

        print(head);

        sc.close();
    }

    public static class Node {

        int val;
        Node next;

        Node(int v1) {
            val = v1;
            next = null;
        }

    }

    public static void insert(Node head, int k) {
        Node n1 = new Node(k);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;

    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
