import java.util.Scanner;

public class s2task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of alphabets: ");
        String input = sc.nextLine();

        // Create an array to store the count of each alphabet
        int[] alphabetCount = new int[26];

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // If the character is an alphabet (a-z or A-Z), increment the count for that alphabet
            if (Character.isAlphabetic(ch)) {
                alphabetCount[Character.toLowerCase(ch) - 'a']++;
            }
        }

        // Find the alphabet with the maximum count
        int maxCount = 0;
        char maxAlphabet = 'a';
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxAlphabet = (char)('a' + i);
            }
        }

        System.out.println("The alphabet with the maximum occurrence is: " + maxAlphabet);
    }
}
