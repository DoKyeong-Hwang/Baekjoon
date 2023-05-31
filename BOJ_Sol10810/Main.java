package BOJ_Sol10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] answer = new int[n];

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int value = scanner.nextInt();

            for (int j = start - 1; j < end; j++) {
                answer[j] = value;
            }
        }

        for (int k : answer) {
            System.out.print(k + " ");
        }
    }
}
