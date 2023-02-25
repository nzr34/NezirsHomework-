package HomeWork05;

public class Task2ArraysGroupName {
    public static void main(String[] args) {


    /*2) Create an array of names and store all names of your group.
    Then print your name from that array. (use 2 different ways of creating an array).*/
        //Solution
        //1st way
        String[] classMates ={"Nezir","Cahit","Musa","Onur","Hassan","Mouhsine"};
        System.out.println("My Name is " + classMates[0]);
        //2nd way
       String[]classmates2=new String[6];
        classmates2[0]="Nezir";
        classmates2[1]="Cahit";
        classmates2[2]="Musa";
        classmates2[3]="Onur";
        classmates2[4]="Hassan";
        classmates2[5]="Mouhsine";
        System.out.println("My Name is " + classmates2[0]);

    }
}
