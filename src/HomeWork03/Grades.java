package HomeWork03;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        double quizScore, midtermScore,finalScore;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your quiz score ;");
        quizScore= scan.nextDouble();
        System.out.println("Please enter your midterm score ;");
        midtermScore= scan.nextDouble();
        System.out.println("Please enter your final score ;");
        finalScore= scan.nextDouble();
        double avarageScore=(quizScore+midtermScore+finalScore)/3;
        if(avarageScore>=90){
            System.out.println("grade=A");
        }else if(avarageScore>=70&&avarageScore<90){
            System.out.println("grade=B");
        }else if(avarageScore>=50&&avarageScore<70){
            System.out.println("grade=C");

        }else if(avarageScore<50){
            System.out.println("grade=F");

        }

    }
}
