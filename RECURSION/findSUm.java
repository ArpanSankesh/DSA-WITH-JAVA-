public class findSUm {
    public static void main(String[] args) {
        int n = 3;
        int sum = sum(n);
        System.out.println(sum);
    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n-1);
    }
        
}
