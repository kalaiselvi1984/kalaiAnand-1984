import java.util.Scanner;

public class S2DMTASK6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Reverse the digits of the number
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        // Output the reversed number
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
