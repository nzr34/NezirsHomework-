package HomeWork19;

public class Task6ArrayAndClasses {

    static abstract  class Insurance {
        String insuranceName;

        public abstract void getQuote();

        public abstract void cancelInsurance();


    }

          static class Car extends Insurance {
             public Car(String carModel) {
                 this.carModel = carModel;
             }

             public String carModel;

             @Override
             public void getQuote() {
                 System.out.println("Get your cars insurance for $50.00!");
             }

             @Override
             public void cancelInsurance() {
                 System.out.println("Cancel your car insurance");
             }
         }

         static class Pet extends Insurance {
             public Pet(String petType) {
                 this.petType = petType;
             }

             public String petType;

             @Override
             public void getQuote() {
                 System.out.println("Your pet insurance is $50.00");
             }

             @Override
             public void cancelInsurance() {
                 System.out.println("Cancel your pet insurance");
             }
         }
        static class Health extends Insurance {

             @Override
            public  void getQuote() {
                 System.out.println("Your health insurance is $450.00");
              }

             @Override
             public void cancelInsurance() {
                 System.out.println("Cancel Your health insurance");
                }
            }


}
