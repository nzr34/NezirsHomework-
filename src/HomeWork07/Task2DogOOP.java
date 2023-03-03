package HomeWork07;

public class Task2DogOOP {
    public static void main(String[] args) {

        /*Create a Dog Class and create 3 different objects of it:
        Husky, Bulldog, Labrador  with specific  attributes and behaviors.*/
        Task3Dog husky = new Task3Dog();
        husky.name = "Fluffy";
        husky.breed = "Siberian Husky";
        husky.longhair = true;
        husky.barks();
        husky.jumpy();

        System.out.println("<><><><><><><><><>");

        Task3Dog bulldog = new Task3Dog();
        husky.name = "Hunter";
        husky.breed = "Bulldog";
        husky.longhair = false;
        husky.barks();

        System.out.println("<><><><><><><><><>");

        Task3Dog labrador = new Task3Dog();
        labrador.name = "Max";
        labrador.breed = "Labrador Retriever ";
        labrador.longhair = false;
        labrador.barks();
        labrador.jumpy();


    }
}
