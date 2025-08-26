public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla"); // Create a Car object with a type name
        myCar.fillTank(); // Fill the fuel tank to full

        // Accelerate the car three times
        for (int i = 0; i < 3; i++) {
            myCar.accelerate(); // Increase speed by 10 and reduce fuel by 1
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Set cruise control target speed
        myCar.setCruiseTargetSpeed(50); // Set desired cruise speed
        boolean cruiseActivated = myCar.turnCruiseControlOn(); // Try to activate cruise control

        if (cruiseActivated) {
            System.out.println("Cruise control activated at target speed: " + myCar.getCruiseTargetSpeed() + " km/h");
        } else {
            System.out.println("Cruise control could not be activated.");
        }

        // Simulate driving with cruise control for 5 cycles
        for (int i = 0; i < 5; i++) {
            myCar.updateCruiseControl(); // Adjust speed toward target
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Turn off cruise control
        myCar.turnCruiseControlOff();
        System.out.println("Cruise control turned off.");
    }
}
