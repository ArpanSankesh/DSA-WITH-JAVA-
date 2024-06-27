package HashMaps;

public class findFrequency {
    public static void main(String[] args) {
        
        int[] arr = {2,6,3,8,2,8,2,3,8,10,6};
        int[] Q = {2,8,3,5};

        ferquency(arr,Q);

    }

    public static void ferquency(int[] arr , int [] Q){
        for(int i=0; i<Q.length; i++){
            int val = Q[i];
            int count = 0;
            for(int j=0; j<arr.length;j++){
                if (arr[j] == val) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
