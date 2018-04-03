package chat;

import java.util.ArrayList;

public class Roundness {
    boolean roundy(int n) {
        String len = String.valueOf(n);
        boolean first = false;
        int ilen = len.length();
        int i = 0;
        int zeroes = 0;
        int starting = 0;
        while (i < ilen) {
            int temp = (int) Math.pow(10, i);
            int num = (n / temp) % 10;
            if (num == 0) {
                zeroes++;
                if (first == false) {
                    first = true;
                    starting = i;
                }
            }
            i++;
        }
        int last = zeroes + starting;
        System.out.println("last: " + last);
        int j = 0;
        int pos = 1;
        while (j < ilen) {
            int temp = (int) Math.pow(10, j);
            int num = (n / temp) % 10;
            if (zeroes == 1 && ilen>last) return true;
            if (num == 0 && j+1> last) return true;
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        Roundness r = new Roundness();
        System.out.println("result: " + r.roundy());
    }
}
