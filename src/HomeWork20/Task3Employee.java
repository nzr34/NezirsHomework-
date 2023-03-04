package HomeWork20;

import java.util.*;

public class Task3Employee {

        /*Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employee who gets the highest salary.
        Output should be in the below format
            John Smith=$100000*/
    public static void main(String[] args) {
        Map<String,Integer>employee=new HashMap<>();

        employee.put("Alex Denver",98000);
        employee.put("John Smith",100000);
        employee.put("Susan Demir",87000);
        employee.put("Sultan Smith",78000);
        employee.put("Frank Fredrick",70000);
        int highSalary=0;
        String highEmployee="";
        for (var a:employee.entrySet()
             ) {
            if (a.getValue()>highSalary){
                highSalary=a.getValue();
                highEmployee=a.getKey();

            }
        }
        System.out.println(highEmployee+"=$"+highSalary);

        }
        }







