package InClassPractice;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}

class Master extends Degree {
    void getPrerequisite() {
        System.out.println("To get master degree you need Bachelors diploma");
    }
}

class Bachelors extends Degree {


    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Master master = new Master();
        master.getPrerequisite();
    }
}