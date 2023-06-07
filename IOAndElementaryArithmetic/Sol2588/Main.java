package IOAndElementaryArithmetic.Sol2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        sc.close();

        System.out.println(operand1 * (operand2 % 10));
        System.out.println(operand1 * (operand2 % 100 / 10));
        System.out.println(operand1 * (operand2 / 100));
        System.out.println(operand1 * operand2);
    }
}
