import java.util.Scanner;

public class S2DMTASK8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;
        int next;
        System.out.println("Fibonacci series of " + n + " terms:");

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }
    }
}
