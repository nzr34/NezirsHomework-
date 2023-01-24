package Homework6;

public class Task10seccondMax {
    public static void main(String[] args) {

                int []nums={200,45,788,54,34,87,65};

                int max = 0;
                int max2nd = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] > max) {
                        max2nd = max;
                        max = nums[i];
                    } else if (nums[i] > max2nd && nums[i] != max) {
                        max2nd = nums[i];
                    }
                }


                System.out.println(" 2nd Biggest number is "+max2nd);

            }
        }






