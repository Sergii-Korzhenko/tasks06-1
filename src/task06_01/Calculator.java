package task06_01;

public class Calculator {
    public static void main(String[] args) {

    }
    int plus(int[] a) {
        int l = a.length;
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    double multiply(double a, double b) {
        return a + b;
    }
}
