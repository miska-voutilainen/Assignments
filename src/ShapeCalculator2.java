
// ShapeCalculator-luokka, joka testaa polymorfismin
public class ShapeCalculator2 {
    public static void main(String[] args) {
        // Tulostetaan otsikko
        System.out.println("Shape Calculator\n");

        // Luodaan taulukko muodoista (nyt myös väri mukana)
        Shape2[] shapes2 = {
                new Circle2(5.0, "Red"),
                new Rectangle2(4.0, 6.0, "Blue"),
                new Triangle2(3.0, 8.0, "Green")
        };

        // Käydään taulukko läpi ja tulostetaan jokaisen muodon tiedot
        for (Shape2 shape2 : shapes2) {
            System.out.println(shape2);
        }
    }
}
