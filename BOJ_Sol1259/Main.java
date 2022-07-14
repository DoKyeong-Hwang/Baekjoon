package BOJ_Sol1259;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true) {
            String n = in.next();
            if (n.equals("0"))
                break;

            String[] a = new String[n.length()];
            String[] b = new String[n.length()];

            for(int i = 0; i < n.length();i++)
                a[i] = n.substring(i, i + 1);

            // Reverse
            for(int i = 0; i < n.length(); i++)
                b[i] = a[n.length()-1-i];

            int cnt = 0;
            // 문자 비교 후 cnt ++

            for (int i = 0; i < n.length(); i++){
                if (a[i].equals(b[i]))
                    cnt++;
            }

            if (cnt == n.length())
                System.out.println("yes");
            else
                System.out.println("no");

        }

    }
}
