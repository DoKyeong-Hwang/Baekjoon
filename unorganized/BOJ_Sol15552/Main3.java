package unorganized.BOJ_Sol15552;

// StringTokenizer 생성 x
// String.substring() 메소드 사용
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));
            sb.append(result+"\n");
        }

        br.close();
        System.out.print(sb);
    }
}
