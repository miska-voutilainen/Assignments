public class Car {
    private double speed;
    private double gasolineLevel;
    private final String typeName;

    // Cruise control variables
    private boolean cruiseControlOn;
    private double cruiseTargetSpeed;
    private final double MIN_CRUISE_SPEED = 30;
    private final double MAX_CRUISE_SPEED = 120;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        cruiseControlOn = false;
        cruiseTargetSpeed = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 1;
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0 && amount > 0) {
            speed = Math.max(0, speed - amount);
            gasolineLevel -= 0.5;
        } else {
            speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    // Cruise control methods
    public void setCruiseTargetSpeed(double speed) {
        if (speed >= MIN_CRUISE_SPEED && speed <= MAX_CRUISE_SPEED) {
            cruiseTargetSpeed = speed;
        }
    }

    public double getCruiseTargetSpeed() {
        return cruiseTargetSpeed;
    }

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

    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }

    public void updateCruiseControl() {
        if (!cruiseControlOn || gasolineLevel <= 0) return;

        if (speed < cruiseTargetSpeed) {
            accelerate();
        } else if (speed > cruiseTargetSpeed) {
            decelerate(5);
        }

        if (gasolineLevel <= 0 || speed == 0) {
            cruiseControlOn = false;
            System.out.println("Cruise control deactivated due to low fuel or zero speed.");
        }
    }
}
