package unorganized.BOJ_Sol2577;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int result = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(result);
        in.close();

        for (int i = 0; i < 10; i++){
            int cnt = 0;
            for (int j = 0; j < str.length(); j++){
                if ((str.charAt(j) - '0') == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
