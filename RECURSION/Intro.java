public class Intro {
    public static void main(String[] args) {
        int x = 20; 
        int y = 30;
        int temp1 = add(x,y);
        int temp2 = mul(temp1,30);
        int temp3 = sub(temp2,75);

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
    }   

    public static int add(int x , int y){
        return x+y;
    }
    public static int mul(int x , int y){
        return x * y;
    }
    public static int sub(int x , int y){
        return x - y;
    }
}
