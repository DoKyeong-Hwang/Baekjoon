package unorganized.BOJ_Sol10950;
import java.util.Scanner;

/*public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
        in.close();
    }
}*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            result[i] = a + b;
        }
        in.close();

        for (int r : result){
            System.out.println(r);
        }
    }
}