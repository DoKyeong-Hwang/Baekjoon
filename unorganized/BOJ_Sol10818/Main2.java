package unorganized.BOJ_Sol10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int index = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        while (st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}
