package Homework13;


public class Task5StudentClass {
    String name;
    String address;

    Task5StudentClass(String cName,String cAddress){
        name=cName;
        address=cAddress;

    }

    public void displayInfo(){
        System.out.println("Name:"+name+" Address:"+address);
    }

    public static void main(String[] args) {
        Task5StudentClass c12=new Task5StudentClass("John","123 st 12av apt 5 FT/Florida/33333");
        c12.displayInfo();
    }
}

