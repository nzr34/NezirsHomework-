package HomeWork11;


public class Task2EvenorOdd {
    /*Create a method that will take a number and prints whether the number is even or odd.*/
  void isEven(int num) {
    if (num % 2 == 0) {
          System.out.println(num + " is even");
      } else {
          System.out.println(num + " is odd");
      }
  }
    public static void main(String[] args) {
        Task2EvenorOdd number=new Task2EvenorOdd();
        number.isEven(3);
    }
}


