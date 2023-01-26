package Homework10;

public class reverseWordsOneByOne {
    public static void main(String[] args) {
        String input = "Java is getting more fun and more complex";
        String[] words = input.split(" ");
        String sentence = "";
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            char[] letters = word.toCharArray();

            for (int i = letters.length - 1; i >= 0; i--) {
                sentence += letters[i];
            }
            sentence += " ";
        }
        System.out.println(sentence);
    }
}
