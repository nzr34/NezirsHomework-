package HomeWork01;

public class Task3Variables {
    public static void main(String[]args){
        /*TASK:Create a Java program and name it Variables
          a)In your program create different type of variables to store student’s
          information and then print value of those variables:
          name-lastName-grade-city-state-phoneNumber
          b)   Change student’s city, state, phone number and grade. And print those updated values*/
    String name ="Joe";
    String lastname ="Baran";
    int age=24;
    char grade='B';
        grade='A';                           //Updated values
    String city ="Nashville";
        city ="Newport";                     //Updated values
    String state ="TN";
        state ="RI";                         //Updated values
    String phoneNumber ="901-234-56-78";
        phoneNumber ="911-444-66-88";        //Updated values


    System.out.println("Name         :"+name);
    System.out.println("Lastname     :"+lastname);
    System.out.println("Age          :"+age);
    System.out.println("Grade        :"+grade);
    System.out.println("City         :"+city);
    System.out.println("State        :"+state);
    System.out.println("Phone Number :"+phoneNumber);



    }
}
