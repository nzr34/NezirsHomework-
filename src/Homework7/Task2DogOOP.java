package Homework7;

public class Task2DogOOP {
    public static void main(String[] args) {

        /*Create a Dog Class and create 3 different objects of it:
        Husky, Bulldog, Labrador  with specific  attributes and behaviors.*/
        Dog husky=new Dog();
        husky.name="Fluffy";
        husky.breed="Siberian Husky";
        husky.longhair=true;
        husky.barks();
        husky.jumpy();

        System.out.println("<><><><><><><><><>");

        Dog bulldog=new Dog();
        husky.name="Hunter";
        husky.breed="Bulldog";
        husky.longhair=false;
        husky.barks();

        System.out.println("<><><><><><><><><>");

        Dog labrador=new Dog();
        labrador.name="Max";
        labrador.breed="Labrador Retriever ";
        labrador.longhair=false;
        labrador.barks();
        labrador.jumpy();


    }
}
