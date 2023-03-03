package InClassPractice;

public class SyntaxEmployee {
    int empID;
    int salary;
    static String CEO = "Sumair and Asel";


    public static void main(String[] args) {
        SyntaxEmployee asgarNazir = new SyntaxEmployee();
        SyntaxEmployee katerina = new SyntaxEmployee();
        asgarNazir.empID = 123;
        asgarNazir.salary = 150000;
        katerina.empID = 456;
        katerina.salary = 110000;

        System.out.println("Asgar: " + "eID: " + asgarNazir.empID);
        System.out.println("    Salary: " + asgarNazir.salary);
        System.out.println("    CEO: " + SyntaxEmployee.CEO);
        System.out.println("Katerina: " + "eID: " + katerina.empID);
        System.out.println("    Salary: " + katerina.salary);
        System.out.println("    CEO: " + SyntaxEmployee.CEO);
    }

}

