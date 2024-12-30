public class JavaRush_10 {
    public static final double PI = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Площадь круга равна: " + PI * radius * radius);
        System.out.println("Периметр круга равен: " + PI * diameter);

        System.out.println(Earth.NAME);
        System.out.println(Earth.SQUARE);
        System.out.println(Earth.POPULATION);
        System.out.println(Earth.EQUATOR_LENGTH);
    }
}
class Earth {
    public static final String NAME = "Земля";
    public static final double  SQUARE = 510_100_000;
    public static final long POPULATION = 7_594_000_000L;
    public static final long EQUATOR_LENGTH = 40_075_696;
}
