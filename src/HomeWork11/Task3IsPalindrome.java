package HomeWork11;

public class Task3IsPalindrome {
    String isPalindrome(String word) {
        /*Create a method that will print whether given String is palindrome or not.*/
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed)) {
            return word + " is a palindrome";
        } else {
            return word + " is not a palindrome";
        }

    }

    public static void main(String[] args) {
        Task3IsPalindrome newWord = new Task3IsPalindrome();
        System.out.println(newWord.isPalindrome("John"));
        System.out.println(newWord.isPalindrome("Level"));
    }
}
