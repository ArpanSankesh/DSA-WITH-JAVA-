package linkedList;

import java.util.Scanner;

public class insertAtINDEX {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        System.out.print("Enter the Value of K : ");
        int k = sc.nextInt();

        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        
        insert(head,60,k);

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

    public static void insert(Node head, int v, int k) {
        Node n1 = new Node(v);
        Node temp = head;

        for(int i = 1; i <= k-1; i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = n1;
        n1.next = temp1;

    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
