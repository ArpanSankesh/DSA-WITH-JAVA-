public class findSUm {
    public static void main(String[] args) {
        int n = 10;
        int sum = sum(n);
        System.out.println(sum);
    }

    public static int sum(int n) {
        if (n == 1) {

            return 1;
        }
        return n + sum(n-1);
    }
        
}
