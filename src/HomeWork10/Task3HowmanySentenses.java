package HomeWork10;

public class Task3HowmanySentenses {
    public static void main(String[] args) {
        /*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?*/
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] starr = a.split("[!.?]");
        System.out.println("Total Sentences in the String a is :" + starr.length);
    }
}
