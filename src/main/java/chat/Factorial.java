package chat;

public class Factorial {
    int leastFactorial(int n) {
        int x = 0;
        int temp = 0;
        while (temp < n) {
            x +=1;
            temp = factorial(x);
            System.out.println("temp: " + temp);
        }
        return x;
    }
    int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        return (n * factorial(n-1));
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("ans " + f.leastFactorial(17));
        //System.out.println("ans " + f.factorial(6));
    }
}
