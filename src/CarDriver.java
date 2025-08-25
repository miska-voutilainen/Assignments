public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        // Accelerate a bit
        for (int i = 0; i < 3; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Set cruise control target speed
        myCar.setCruiseTargetSpeed(50);
        boolean cruiseActivated = myCar.turnCruiseControlOn();

        if (cruiseActivated) {
            System.out.println("Cruise control activated at target speed: " + myCar.getCruiseTargetSpeed() + " km/h");
        } else {
            System.out.println("Cruise control could not be activated.");
        }

        // Simulate driving with cruise control
        for (int i = 0; i < 5; i++) {
            myCar.updateCruiseControl();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Turn off cruise control
        myCar.turnCruiseControlOff();
        System.out.println("Cruise control turned off.");
    }
}
