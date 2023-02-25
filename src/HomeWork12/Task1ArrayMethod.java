package HomeWork12;

  class Task1ArrayMethod {
      /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
      Method should be visibly only within same package and accessible by the creating an instance of the class. */
     int arraySum(int []arr){
      int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Task1ArrayMethod arrayNum=new Task1ArrayMethod();
       int []numbers={1,2,3,4,5,6,7,8,9};
        System.out.println(arrayNum.arraySum(numbers));
    }
}
