package Homework9;

public class Task1Stringmethod {
    public static void main(String[] args) {

        /*Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
            For Example String str=hello =>l*/
        String newStr="example23";
        if(!newStr.isEmpty()){
                if(newStr.length()%2!=0&&newStr.length()>3){
                    System.out.println(newStr.charAt(newStr.length()/2));
                }

            }
        }
    }


