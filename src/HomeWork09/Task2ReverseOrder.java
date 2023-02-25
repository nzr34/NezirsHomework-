package HomeWork09;

public class Task2ReverseOrder {
    public static void main(String[] args) {

    /*Create a String and print it in reverse order (Sunday → yadnuS).*/
        String word="dunya";
        StringBuilder wordRev=new StringBuilder(word);
        wordRev.reverse();
        System.out.println(wordRev);
    }
}
