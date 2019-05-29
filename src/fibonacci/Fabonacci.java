package fibonacci;

public class Fabonacci {

    public static void main(String[] args) {
        System.out.println(fib1(5));
        System.out.println(fib2(5));
        System.out.println(fib3(5));
    }

    public static int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1, sum = 0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static int fib3(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
}
