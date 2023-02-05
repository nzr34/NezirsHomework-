package InClassHW;

public class Student {
    String name;
    String address;
    Student(String name,String address){
        this.name=name;
        this.address=address;
        System.out.println(this.name+" "+this.address);
    }

    public static void main(String[] args) {
        Student student1=new Student("John","123 nw 17th street  apt 4");
    }
}
