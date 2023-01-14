package Homework;

public class Perimeter {
    public static void main(String[] args) {

        /*TASK: Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
         Your program should say. “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
        The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0*/

        double regtangleWidth = 5;
        double regtangleHeight = 8;
        System.out.println("The perimeter of a rectangle with width "
                + regtangleWidth + " and height " + regtangleHeight +
                " is equal to " + (2 * (regtangleWidth + regtangleHeight)) +
                " and the area is " + (regtangleHeight * regtangleWidth));


        char c = 'M';
        if (c == 'M') {
            System.out.println("male");
        }
        String name = "Nezir";
        if (name.equals("Nezir")) {
            System.out.println("Nezir you did it");
        }

        boolean hungry = true;
        if (hungry) {
            System.out.println("you did it again");

        }
        boolean angry = false;
        if (angry) {
            System.out.println("you did it again");
        }
    }
}

