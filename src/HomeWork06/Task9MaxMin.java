package HomeWork06;

public class Task9MaxMin {
    public static void main(String[] args) {
        int[] numbers ={200,45,78,54,34,87,65};
        int minnum=numbers[0];
        int maxnum=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {
            if(numbers[i]>maxnum){
                maxnum=numbers[i];
            }
            if(numbers[i]<minnum){
                minnum=numbers[i];
            }
        }
        System.out.println("Smallest number is "+minnum);
        System.out.println("Biggest number is "+maxnum);

        }
            }







