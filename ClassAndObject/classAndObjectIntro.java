package ClassAndObject;

public class classAndObjectIntro {
    public static void main(String[] args) {
        Pair p1 = new Pair(10, 20);

        System.out.println(p1.x + p1.y);

        Pair p2 = new Pair(40, 50);

        System.out.println(p2.x + p2.y);

    }

    public static class Pair {
        int x;
        int y;

        Pair(int v1, int v2) {
            x = v1;
            y = v2;
        }
    }
}