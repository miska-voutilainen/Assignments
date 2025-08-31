// Shape-luokka, perusmuoto
class Shape2 {
    protected String color; // Väriominaisuus

    // Konstruktori, joka ottaa värin
    public Shape2(String color) {
        this.color = color;
    }

    // Metodi, joka laskee pinta-alan (oletus 0)
    public double calculateArea() {
        return 0;
    }
}
