import java.util.Scanner;

public class s2task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the full name into an array of words
        String[] words = fullName.split(" ");

        // Print the first letter of the first and middle names followed by a period
        System.out.print(words[0].charAt(0) + ".");
        if (words.length > 2) {
            System.out.print(words[1].charAt(0) + ".");
        }

        // Print the last name
        System.out.println(words[words.length - 1]);
    }
}

