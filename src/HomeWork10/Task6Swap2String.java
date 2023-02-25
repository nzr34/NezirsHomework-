package HomeWork10;

public class Task6Swap2String {
    public static void main(String[] args) {

        /* How would you swap  2 strings without a temporary variable?*/
        String str1="Aldi";
        String Str2="not Aldi";
        str1=str1.replaceAll("Aldi","not Aldi");
        System.out.println(str1);
    }


}
