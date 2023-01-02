public class s2task9 {
    public static String deleteConsonants(String string) {
        String vowels = "aeiouAEIOU";
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "Hello, have a good day";
        System.out.println(deleteConsonants(string));
    }
}
