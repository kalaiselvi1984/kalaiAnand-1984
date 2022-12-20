import java.util.Scanner;

public class task3 {
    public static void main(String[] args)
    {
        int num1, num2;
        int sum, sub, mult;
        Scanner op=new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1=op.nextInt();
        System.out.print("Enter second number:");
        num2=op.nextInt();
        sum = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        System.out.println("SUM = "+sum);
        System.out.println("DIFFERENCE = "+sub);
        System.out.println("PRODUCT = "+mult);
    }
}

