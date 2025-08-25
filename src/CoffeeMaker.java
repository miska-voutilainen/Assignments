public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType; // "normal" or "espresso"
    private int coffeeAmount;  // 10–80 ml

    public CoffeeMaker() {
        isOn = false;
        coffeeType = "normal"; // default
        coffeeAmount = 10;     // default
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCoffeeType(String type) {
        if (isOn && (type.equals("normal") || type.equals("espresso"))) {
            coffeeType = type;
        }
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
