package BOJ_Sol10951;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
        in.close();
    }
}
