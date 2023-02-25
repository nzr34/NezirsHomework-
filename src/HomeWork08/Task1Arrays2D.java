package HomeWork08;

public class Task1Arrays2D {
    public static void main(String[] args) {
        /*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        Then your program should print name of the students that has A and B grade*/
        String[][] studentGrades = {{"Nezir","Mike","Sara","Anna"},{"A","B","C","B"}};


        for (int i = 0; i < studentGrades[0].length; i++) {
            if (studentGrades[1][i].equals("A") || studentGrades[1][i].equals("B")) {
                System.out.println(studentGrades[0][i]+":"+studentGrades[1][i]);

            }

        }


    }
}


