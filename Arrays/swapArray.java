package Arrays;

public class swapArray {
    // "static void main" must be defined in a public class.

    public static void main(String[] args) {
        int[] arr = {10,20};
        
        swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
            
    }

}
