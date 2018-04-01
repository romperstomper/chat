package chat;

import java.util.ArrayList;

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        int sum = 0;
        for (int x : result) {
            System.out.println("num: " + String.valueOf(x));
            sum += x;
        }
        return sum + n;
    }
    public static void main(String[] args){
        MyCalculator c = new MyCalculator();
        System.out.println("total: " + c.divisor_sum(6));
    }
}
