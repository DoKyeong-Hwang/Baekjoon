package unorganized.BOJ_Sol2741;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}
