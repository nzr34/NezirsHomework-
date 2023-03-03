package HomeWork11;

public class Task6Student {
    static int getGrade(int num) {
       /*Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
        score > 90 - A
        score >80 - B
        score >70 - C
        score > 50 - D
        anything else - F*/
        if (num > 90) {
            System.out.println("Grade A");
        } else if (num > 80 && num < 90) {
            System.out.println("Grade B");

        } else if (num > 70 && num < 80) {
            System.out.println("Grade C");

        } else if (num > 60 && num < 70) {
            System.out.println("Grade D");

        } else {
            System.out.println("Grade F");

        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(getGrade(56));
    }
}
