package HomeWork10;

public class Task5palidrome {

        public static void main(String[] args) {

            /*How would you check if String is palindrome or not? aba=> true
            Abbc =>false*/
            String s = "aba";
            int n = s.length();
            boolean isPalindrome = true;
            for (int i = 0; i < (n/2); ++i) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is not a palindrome.");
            }
        }
    }

