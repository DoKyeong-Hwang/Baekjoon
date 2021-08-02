package BOJ_Sol2741;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
