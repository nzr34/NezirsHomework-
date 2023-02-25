package InClassHW2;

public class Tester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),new CollageStudent(),new SchoolStudent()};
        for (Student student : students) {
            student.StudentMethod();
            student.StudentMethod2();

        }


        }
    }

