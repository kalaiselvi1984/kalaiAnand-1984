import java.util.Scanner;

public class S2DMTASK7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Check if the number is less than 2
        if (num < 2) {
            isPrime = false;
        } else {
            // Check if the number is prime
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

