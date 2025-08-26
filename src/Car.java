public class Car {
    private double speed;               // Current speed of the car
    private double gasolineLevel;       // Current fuel level
    private final String typeName;      // Car model/type name

    // Cruise control variables
    private boolean cruiseControlOn;    // Is cruise control active?
    private double cruiseTargetSpeed;   // Desired speed for cruise control
    private final double MIN_CRUISE_SPEED = 30;  // Minimum allowed cruise speed
    private final double MAX_CRUISE_SPEED = 120; // Maximum allowed cruise speed

    // Constructor
    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        cruiseControlOn = false;
        cruiseTargetSpeed = 0;
    }

    // Accelerate the car by 10 units if there's fuel
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 1;
        } else {
            speed = 0;
        }
    }

    // Decelerate the car by a given amount if there's fuel
    public void decelerate(int amount) {
        if (gasolineLevel > 0 && amount > 0) {
            speed = Math.max(0, speed - amount);
            gasolineLevel -= 0.5;
        } else {
            speed = 0;
        }
    }

    // Get current speed
    public double getSpeed() {
        return speed;
    }

    // Get car type name
    public String getTypeName() {
        return typeName;
    }

    // Fill the fuel tank to full (100 units)
    public void fillTank() {
        gasolineLevel = 100;
    }

    // Get current fuel level
    public double getGasolineLevel() {
        return gasolineLevel;
    }

    // Set cruise control target speed within allowed range
    public void setCruiseTargetSpeed(double speed) {
        if (speed >= MIN_CRUISE_SPEED && speed <= MAX_CRUISE_SPEED) {
            cruiseTargetSpeed = speed;
        }
    }

    // Get cruise control target speed
    public double getCruiseTargetSpeed() {
        return cruiseTargetSpeed;
    }

    // Turn cruise control on if conditions are met
    public boolean turnCruiseControlOn() {
        if (gasolineLevel > 0 &&
                cruiseTargetSpeed >= MIN_CRUISE_SPEED &&
                cruiseTargetSpeed <= MAX_CRUISE_SPEED) {
            cruiseControlOn = true;
            return true;
        }
        cruiseControlOn = false;
        return false;
    }

    // Turn cruise control off
    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }

    // Update cruise control behavior based on current speed and fuel
    public void updateCruiseControl() {
        if (!cruiseControlOn || gasolineLevel <= 0) return;

        if (speed < cruiseTargetSpeed) {
            accelerate();
        } else if (speed > cruiseTargetSpeed) {
            decelerate(5);
        }

        // Disable cruise control if fuel runs out or speed drops to zero
        if (gasolineLevel <= 0 || speed == 0) {
            cruiseControlOn = false;
            System.out.println("Cruise control deactivated due to low fuel or zero speed.");
        }
    }
}
