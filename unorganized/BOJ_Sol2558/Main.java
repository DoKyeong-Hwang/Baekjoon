package unorganized.BOJ_Sol2558;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int operand1, operand2;
        int out1, out2, out3;
        int result;

        Scanner scan = new Scanner(System.in);
        operand1 = scan.nextInt();      // (1)
        operand2 = scan.nextInt();      // (2)

        scan.close();

        out1 = operand1 * (operand2 % 10);      // (3)
        out2 = operand1 * ((operand2/10)%10);      // (4)
        out3 = operand1 * (operand2 / 100);             // (5)

        result = operand1 * operand2;                   // (6)

        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);

        System.out.println(result);
    }
}
