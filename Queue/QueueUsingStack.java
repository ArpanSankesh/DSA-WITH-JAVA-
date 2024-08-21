// package Queue;

import java.util.*;

public class QueueUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value " + i + " : ");
            q.add(sc.nextInt());
        }

        System.out.print(q);
        findFirst(q);
        sc.close();
    }

    public static void findFirst(Queue<Integer> q){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (!q.isEmpty()) {
            s1.push(q.remove());
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        while(!s2.isEmpty()){
            q.add(s2.pop());
        }

        System.out.println("Queue after processing: " + q);
    }
}
