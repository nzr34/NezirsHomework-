package HomeWork06;

public class Task11duplicate {
    public static void main(String[] args) {
        String[] words = {"Nezir", "cahit","is", "hello","learning", "java!", "Nezir","is","learning", "java!"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.print(words[i]+" ");
                }
            }
        }
    }
}
