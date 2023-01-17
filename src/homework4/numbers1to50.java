package homework4;

public class numbers1to50 {
    public static void main(String[] args) {
        /*Print numbers from 1 to 50 except those that are divisible by 3*/
        for (int n = 1; n <=50 ; n++) {//1st Way
          if(n%3!=0)
            System.out.println(n);
    }
        for (int n = 1; n <=50 ; n++) {//2nd Way
            if(n%3==0){
                continue;
            }
                System.out.println(n);
        }


}}
