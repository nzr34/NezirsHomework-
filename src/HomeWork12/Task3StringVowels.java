package HomeWork12;

public class Task3StringVowels {
    private String vovels(String str) {
        return str.replaceAll("[^AaEeIiOoUuYyWw]", "");

    }

    public static void main(String[] args) {


        Task3StringVowels newStr = new Task3StringVowels();
        System.out.println(newStr.vovels("asdfghikHYjikGfRtGhyFdrOoKjh"));

        /*Static version

         private static String vovels(String str){
       return str.replaceAll("[^AaEeIiOoUuYyWw]","");

    }

    public static void main(String[] args) {



        System.out.println(vovels("asdfghikHYjikGfRtGhyFdrOoKjh"));
    }*/
    }
}
