package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();

        Queue <Integer> qu = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i+1) + " : ");
            qu.add(sc.nextInt());
        }

        System.out.println(qu);

      
      Queue<Integer> result = reverse(qu, k);;
      System.out.println(result); 

        sc.close();
    }

    public static Queue<Integer> reverse(Queue<Integer> q , int k ){
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for (int i = 1; i <= k; i++) {
            int temp = q.remove();
            st.push(temp);
        }

        for (int i = 1; i <= k ; i++) {
            int temp = st.pop();
            q.add(temp);
        }

        for (int i = 1; i <= n-k; i++) {
            int temp = q.remove();
            q.add(temp);
        }
        return q;

    }
}
