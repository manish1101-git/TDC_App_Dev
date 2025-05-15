class Vehicle {
    protected int speed; 
    protected double fuel; 

    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
    }
}


class Car extends Vehicle {
    
    public Car(int speed, double fuel) {
        super(speed, fuel);
       
    }

   
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
       
    }
}


class Bike extends Vehicle {
 
    public Bike(int speed, double fuel) {
        super(speed, fuel);
       
    }


    public void displayDetails() {
        System.out.println("Bike Details:");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
       
}
}

// Test class
public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(180, 50.0);
        Bike bike = new Bike(100, 15.0);

        car.displayDetails();
        System.out.println();
        bike.displayDetails();
    }
}
