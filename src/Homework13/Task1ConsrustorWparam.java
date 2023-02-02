package Homework13;

public class Task1ConsrustorWparam {

    String brand;
    String color;
    int price;
    int version;

    Task1ConsrustorWparam(String cBrand,String cColor,int cPrice,int cVersion){
    brand=cBrand;
    color=cColor;
    price=cPrice;
    version=cVersion;
    }
   Task1ConsrustorWparam(){};

    void print (){
        System.out.println("Brand :"+brand+" Color :"+color+" Price :"+price+" Version :"+version);
    }

}


