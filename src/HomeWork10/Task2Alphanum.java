package HomeWork10;

public class Task2Alphanum {
    public static void main(String[] args) {
        /*Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.*/
        String aa = "j1h2ve 176d8t3l vhb13o817e t r q i d g 1379ey13; udg1hli13u10 8pdy130[1/1'1 dg1[30g13 g0'd[1";
        int count = 0;
        for (int i = 0; i < aa.length(); i++) {
            if (Character.isDigit(aa.charAt(i))) {
                count++;
            }
            if (Character.isAlphabetic(aa.charAt(i))) {
                count++;
            }
        }
        System.out.println("Total Alphanumeric count is :" + count);
    }

}

