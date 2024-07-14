public class palindrome {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,2,1 };

        reverse(arr);
        if (reverse(arr)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is NOT a palindrome!");
        }
    }

    public static boolean reverse(int[] arr) {

        int startPoint = 0;
        int endPoint = arr.length - 1;

        while (startPoint < endPoint) {
            if (arr[startPoint] != arr[endPoint]) {
                return false;
            }
            startPoint++;
            endPoint--;
        }
        return true;

    }
}
