package ClassAndObject;

public class classAndObjectIntro {
    public static void main(String[] args) {
        // Pair p1 = new Pair(10, 20);

        // System.out.println(p1.x + p1.y);

        // Pair p2 = new Pair(40, 50);

        // System.out.println(p2.x + p2.y);

        Node n1 = new Node(20);


        Node n2 = new Node(30);

        n1.next = n2;
        System.out.println(n1.next.val);



    }

    public static class Pair {
        int x;
        int y;

        Pair(int v1, int v2) {
            x = v1;
            y = v2;
        }
    }

    public static class Node{
        int val;
        Node next ;

        Node(int v1){
            val = v1;
        }
    }
}