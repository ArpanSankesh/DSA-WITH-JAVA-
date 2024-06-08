package Arrays;
// import java.util.*;

public class ArrayIntro {
    public static void main(String[] args) {
        // int[] arr = new int[5]; 
        int[] arrr = {1, 2, 3, 4, 5};

        // Print the third element (index 2) of the arrr array
        System.out.println("Original third element : " + arrr[2]);

        // Modify the third element (index 2) of the arrr array
        arrr[2] = 0;

        // Print the modified third element (index 2) of the arrr array
        System.out.println("Modified third element : " + arrr[2]);

        System.out.println("Size of Array is : " + arrr.length);
    }
}
