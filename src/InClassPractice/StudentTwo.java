package InClassPractice;

public class StudentTwo {
    String name;
    String address;

    StudentTwo(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println(this.name + " " + this.address);
    }

    public static void main(String[] args) {
        StudentTwo student1 = new StudentTwo("John", "123 nw 17th street  apt 4");
    }
}
