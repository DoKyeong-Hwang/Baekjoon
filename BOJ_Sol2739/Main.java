package BOJ_Sol2739;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int dan = in.nextInt();
        in.close();

        for(int i = 1; i < 10; i++){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }
}