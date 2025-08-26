public class CoffeeMaker {
    private boolean isOn;           // Indicates if the coffee maker is powered on
    private String coffeeType;      // Type of coffee: "normal" or "espresso"
    private int coffeeAmount;       // Amount of coffee in ml (10–80 ml)

    // Constructor initializes default values
    public CoffeeMaker() {
        isOn = false;
        coffeeType = "normal"; // Default coffee type
        coffeeAmount = 10;     // Default coffee amount
    }

    // Turn the coffee maker on
    public void turnOn() {
        isOn = true;
    }

    // Turn the coffee maker off
    public void turnOff() {
        isOn = false;
    }

    // Check if the coffee maker is on
    public boolean isOn() {
        return isOn;
    }

    // Set the coffee type (only if the machine is on and type is valid)
    public void setCoffeeType(String type) {
        if (isOn && (type.equals("normal") || type.equals("espresso"))) {
            coffeeType = type;
        }
    }

    // Set the coffee amount (only if the machine is on and amount is within range)
    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }

    // Get the current coffee type
    public String getCoffeeType() {
        return coffeeType;
    }

    // Get the current coffee amount
    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
