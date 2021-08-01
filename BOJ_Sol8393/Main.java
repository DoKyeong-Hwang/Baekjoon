package BOJ_Sol8393;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int result = 0;

        for (int i = 1 ; i <= n; i++){
            result += i;
        }
        System.out.println(result);
    }
}
