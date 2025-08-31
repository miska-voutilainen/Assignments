// Rectangle-luokka, joka perii Shape-luokan
class Rectangle2 extends Shape2 {
    private double width, height;

    // Konstruktori, joka ottaa leveyden, korkeuden ja värin
    public Rectangle2(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Pinta-alan laskenta
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Tulostus oikeassa muodossa
    public String toString() {
        return "Area of " + color + " Rectangle with width " + width + " and height " + height + ": " + calculateArea();
    }
}
