package HomeWork19;

import java.util.HashSet;

public class Task2StudentSet {
    static class Student {
        String studentName;
        int idNumber;

        public Student(String studentName, int idNumber) {
            this.studentName = studentName;
            this.idNumber = idNumber;
        }

        public void printInfo() {
            System.out.println("Student name:" + studentName + " Student id:" + idNumber);
        }
    }

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("John", 23456));
        students.add(new Student("David", 45678));
        students.add(new Student("Daniel", 78910));
        students.add(new Student("Morgan", 27654));
        for (Student a : students
        ) {
            a.printInfo();

        }

    }
}

