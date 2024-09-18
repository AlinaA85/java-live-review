package week05;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 1; i <= 10; i++) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
    }
}
