package chat;

import java.util.Scanner;

public class StaticInit {
    static int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        try {
            if (B <= 0 || H <= 0) throw new java.lang.Exception("Breadth and height must be positive");
        } catch (Exception ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }
    public static void main(String[] args) {
    }
}
