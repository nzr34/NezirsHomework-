package InClassPractice;

public class Student {
    public void StudentMethod() {
        System.out.println("This is Parent Class");
    }

    public void StudentMethod2() {
        System.out.println("This is second Method for Parent Class");
    }
}

class SyntaxStudent extends Student {
    @Override
    public void StudentMethod() {
        System.out.println("This is Syntax Student");
    }

    @Override
    public void StudentMethod2() {
        System.out.println("This is Second method from Syntax Student");
    }

    void SyntaxMethod() {
        System.out.println("this method belongs to only Syntax student");
    }
}

class CollageStudent extends Student {
    @Override
    public void StudentMethod() {
        System.out.println("This is Collage Student ");
    }

    void CollageMethod() {
        System.out.println("this method belongs to only Syntax student");
    }
}

class SchoolStudent extends Student {
    @Override
    public void StudentMethod() {
        System.out.println("this is School");
    }

    @Override
    public void StudentMethod2() {
        System.out.println("This is Second method for School Student");
    }

    public static void main(String[] args) {

    }
}



