package HomeWork15;

public class Employee {
    String name;
    String position;
    int salary;

    Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void printInfo() {
        System.out.println("Name :" + name);
        System.out.println("Position :" + position);
        System.out.println("Salary :" + salary);
    }

}

class FullTimeEmployees extends Employee {
    boolean sickLeave;

    FullTimeEmployees(String name, String position, int salary, boolean sickLeave) {
        super(name, position, salary);
        this.sickLeave = sickLeave;
    }

    void healthInsurance() {
        System.out.println("Full Time employees can benefit from health benefits!");
    }

    void fullInfo() {
        System.out.println("Full time employees sick leave :" + sickLeave);
    }
}

class PartTimeEmployees extends Employee {
    boolean healthBenefits;

    PartTimeEmployees(String name, String position, int salary, boolean healthBenefits) {
        super(name, position, salary);
        this.healthBenefits = healthBenefits;
    }

    void printBenefits() {
        System.out.println("Does parttime employee has health benefits:" + healthBenefits);
        System.out.println("Part time employee has access to sick leave!");
    }
}

