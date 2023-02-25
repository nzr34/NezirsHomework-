package HomeWork10;

public class Task4ReverseString {
    public static void main(String[] args) {
        /*ow would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever*/
        String input = "Java is getting more fun and more complex this task took my 3 hours";
        String[] words = input.split(" ");
        for (String word:words) {
            for (int i = word.length()-1; i >=0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
