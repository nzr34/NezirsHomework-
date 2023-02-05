package Homework14;
class Vehicle {
        int wheels;
        int weight;
        int speed;

        void displayVehicleProperties() {
            System.out.println("Number of wheels: " + wheels);
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Speed: " + speed + " km/h");
        }
    static void printF() {//this is for second hw
        System.out.println("This is a vehicle.");
    }
    }

    class TwoWheeler extends Vehicle {
        String handle;

        void displayTwoWheelerProperties() {
            System.out.println("Handle: " + handle);
        }
    }

    class FourWheeler extends Vehicle {
        int doors;

        void displayFourWheelerProperties() {
            System.out.println("Number of doors: " + doors);
        }
        static void display() { /// this is for second homework.
            printF();
            System.out.println("This is a four-wheeler.");
        }
    }

    class Bicycle extends TwoWheeler {
        int gears;

        void displayBicycleProperties() {
            System.out.println("Number of gears: " + gears);
        }
    }

    class Car extends FourWheeler {
        String engineType;

        void displayCarProperties() {
            System.out.println("Engine type: " + engineType);
        }
    }

    class VehicleTester {
        public static void main(String[] args) {
            Bicycle bike = new Bicycle();
            bike.wheels = 2;
            bike.weight = 10;
            bike.speed = 40;
            bike.handle = "Straight";
            bike.gears = 5;
            System.out.println("Bicycle properties: ");
            bike.displayVehicleProperties();
            bike.displayTwoWheelerProperties();
            bike.displayBicycleProperties();

            Car car = new Car();
            car.wheels = 4;
            car.weight = 1000;
            car.speed = 120;
            car.doors = 4;
            car.engineType = "Petrol";
            System.out.println("\nCar properties: ");
            car.displayVehicleProperties();
            car.displayFourWheelerProperties();
            car.displayCarProperties();

            //HW2 starts here
            System.out.println("HW 2nd");
            FourWheeler.printF();

            FourWheeler.display();
        }
    }

