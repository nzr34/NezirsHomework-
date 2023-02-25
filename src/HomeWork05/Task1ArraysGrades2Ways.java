package HomeWork05;

public class Task1ArraysGrades2Ways {
    public static void main(String[] args) {


    /*1) Create an array of chars and store grades into it: A,B,C,D,E,F.
    Then print a grade B (use 2 different ways of creating an array).*/
        //Solution
        //1st way
        char[] grades ={'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Grade: " + grades[1]);
        //2nd way
        char[]grades2=new char[6];
        grades2[0]='A';
        grades2[1]='B';
        grades2[2]='C';
        grades2[3]='D';
        grades2[4]='E';
        grades2[5]='F';
        System.out.println("Grade: " + grades2[1]);

    }
}
