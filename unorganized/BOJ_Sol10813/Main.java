package unorganized.BOJ_Sol10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            int temp;
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            temp = answer[a - 1];
            answer[a - 1] = answer[b - 1];
            answer[b - 1] = temp;
        }

        for (int k : answer)
            System.out.print(k + " ");
    }
}
