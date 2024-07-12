import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number N : ");
        int n = sc.nextInt();

        int answer = inc(n);
        System.out.println("Your fibonaaci at " + n + "th : " + answer);
        sc.close();
    }
    
    
}
