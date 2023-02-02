package Homework13;

 public class Task4StaticConstractor {
   static String brandName="Toyota";
   String colors;
   int prices;
   int versions;
        //Java constructor can not be static
     Task4StaticConstractor(String cBrandc, String cColorc, int cPricec, int cVersionc){
        brandName=cBrandc;
        colors=cColorc;
        prices=cPricec;
        versions=cVersionc;
    }

     public static void main(String[] args) {
        Task4StaticConstractor nwc=new Task4StaticConstractor("Toyota","Blue",25000,4);
         System.out.println(nwc.brandName+" "+nwc.colors+" "+nwc.prices+" "+nwc.versions);
     }
}
