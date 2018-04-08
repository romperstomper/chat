package chat;

import java.util.stream.IntStream;
import java.util.Arrays;

public class Roundness {
    int rounders(int value) {
        String str = String.valueOf(value);
        int strlen = str.length();
        int[] result = Integer.toString(value).chars().map(c -> c -= '0').toArray();
        boolean bump = false;
        for (int i = strlen - 1; i >= 0; i--) {
            int num = result[i];
            if (bump) num++;
            if (i==0) result[i] = num;
            //System.out.println("i " + i + " num " + num + " result " + Arrays.toString(result));
            if (roundy(num) && i > 0) {
                bump = true;
                result[i] = 0;
            }
            if (roundy(num) == false && i > 0) {
                bump = false;
                result[i] = 0;
            }
        }
        System.out.println("result " + Arrays.toString(result));
        IntStream stream = Arrays.stream(result);
        String[] strings = stream.mapToObj(String::valueOf).toArray(String[]::new);
        int intstring = Integer.parseInt(String.join("", strings));
        System.out.println("ans " + intstring);
        return intstring;
    }

    boolean roundy(int n) {
        if (n < 5) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Roundness r = new Roundness();
        int num = r.rounders(1234);
        int sum = r.rounders(20);
        int dum = r.rounders(1445);
        System.out.println(num);
        System.out.println(sum);
        System.out.println(dum);

    }
}
