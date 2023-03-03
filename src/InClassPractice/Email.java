package InClassPractice;

public class Email {
    /*Create a method createEmail(). Based on values of users name,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com*/

    String createEmail(String name, String lastName, String mail) {
        return name + lastName + "@" + mail + ".com";

    }

    public static void main(String[] args) {
        Email nm = new Email();
        System.out.println(nm.createEmail("john", "wick", "gmail"));
    }
}

