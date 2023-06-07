package unorganized.BOJ_Sol1110;
import java.util.Scanner;

// Scanner, while + if 사용
public class Main1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int count = 0;
        int copy = n;

        while(true){
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;

            if (copy == n){
                break;
            }
        }
        System.out.println(count);
    }
}
