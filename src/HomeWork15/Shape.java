package HomeWork15;

public class Shape {
    double radius;
    static double piValue=3.14;
    Shape(double radius ){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
}
class Circle extends Shape{
    Circle(double radius){
        super( radius);


    }
    void areaOfCircle( ){
        System.out.println("The area of circle is ="+(radius*radius)*piValue);

    }


    public static void main(String[] args) {
        Circle newC=new Circle(5);
        newC.areaOfCircle();

    }

}
