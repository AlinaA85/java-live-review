package week05;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 5;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }

}
