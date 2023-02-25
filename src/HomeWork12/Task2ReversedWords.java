package HomeWork12;
public class Task2ReversedWords {
    /*
    Create a method that will take a String as a parameter
     and returns reversed String.Method should be available to all classes within your project
     and accessible by class name./
     */


    public static String reverseWords(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println( reverseWords("monday"));
    }
}
