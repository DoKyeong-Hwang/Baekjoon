package BOJ_Sol2577;
import sun.awt.WindowClosingListener;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int addResult = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(addResult);   // String 으로 형변환
        in.close();

        for (int i = 0; i < 10; i++){
            int cnt = 0;
            for (int j = 0; j < str.length(); j++){
                if ((str.charAt(j) - 48 == i)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
