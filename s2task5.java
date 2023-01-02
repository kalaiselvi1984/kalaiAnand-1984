import java.util.ArrayList;
        import java.util.Arrays;


public class s2task5 {
    public static void main(String[] args) {
        String sentence = "This is Orange Juice";
        String word = "Orange";

        if(isWordExist(sentence, word)){
            System.out.println("Word is exist");
        }
    }

    public static boolean isWordExist(String sentence, String word){
        boolean ans = Boolean.FALSE;
        ArrayList<String> wordList = null;

        try {

            if(sentence != null && word != null){
                wordList = new ArrayList<String>(Arrays.asList(sentence.split("[^a-zA-z]+")));
                if(wordList.contains(word)){
                    ans = Boolean.TRUE;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        return ans;
    }

}
