package HomeWork07;

public class Task1PhoneClass {
    public static void main(String[] args) {
        /*
        Create a Class “Phone”. Create 3 Objects of it:
        iPhone, Pixel, Samsung with specific  attributes and behaviors.
        */

        Task4Phones iphone = new Task4Phones();
        iphone.brand = "Apple";
        iphone.model = "14 proMax";
        iphone.color = "Deep Blue";
        iphone.price = 1099;
        iphone.storage = 128;
        iphone.simcard = false;
        iphone.calling();
        iphone.messaging();
        iphone.photos();

        System.out.println("<><><><><><><><><><><><>");

        Task4Phones pixel = new Task4Phones();
        pixel.brand = "Google";
        pixel.model = "Pixel 7 Pro";
        pixel.color = "Hazel";
        pixel.price = 899;
        pixel.storage = 128;
        pixel.simcard = true;
        pixel.calling();
        pixel.messaging();
        pixel.photos();

        System.out.println("<><><><><><><><><><><><>");

        Task4Phones galaxy = new Task4Phones();
        galaxy.brand = "Samsung";
        galaxy.model = "Galaxy S22 Ultra";
        galaxy.color = "Phantom White";
        galaxy.price = 919.99;
        galaxy.storage = 128;
        galaxy.simcard = true;
        galaxy.calling();
        galaxy.messaging();
        galaxy.photos();


    }
}

