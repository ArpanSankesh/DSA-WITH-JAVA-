
// Calculate nCr using Function
import java.util.*;

public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = cube(3);
        System.out.println(add(n1, cube(2)));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int cube(int a) {
        return a * a * a;
    }

}