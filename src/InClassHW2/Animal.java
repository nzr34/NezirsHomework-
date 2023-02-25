package InClassHW2;

public class Animal {
    public static void main(String[] args) {

    }
    void Speak(){

        System.out.println("Animal Speaks");
    }
    void eat(){

        System.out.println("Animal eats");
    }
}
    class Dog extends Animal{
        void Speak(){

            System.out.println("Dog Barks");
    }
        void eat(){

            System.out.println("Dog eats");
    }
}
    class Cat extends Animal{
        void Speak(){

            System.out.println("Cat miavs" );
    }
        void eat(){

            System.out.println("Cat eats");
    }
}
    class Snake extends Animal{
        void Speak(){

            System.out.println("Snake hiss");
    }
         void eat(){

            System.out.println("Snake eats");
    }
}
