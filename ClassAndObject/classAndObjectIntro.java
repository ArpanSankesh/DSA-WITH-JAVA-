package ClassAndObject;

public class classAndObjectIntro {
    public static void main(String[] args) {
        Pair p1 = new Pair();
        System.out.println(p1.x);
        System.out.println(p1.y);
        
        p1.x = 10;
        p1.x = 20;
        System.out.println(p1.x + p1.y);
        
        Pair p2 = new Pair();
        p2.x = 10;
        p2.x = 20;
        System.out.println(p2.x + p2.y);

    }

    public static class Pair{
        int x; 
        int y;
    }
}