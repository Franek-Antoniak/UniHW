package zadanie.drugie;

public class Hexagon extends Shape {
    private double a;

    public Hexagon(double a, String color) {
        super(color);
        this.a = a;
    }

    @Override
    public double getArea() {
        return 3 * Math.sqrt(3) * a * a / 2;
    }

    @Override
    public double getPerimeter() {
        return 6 * a;
    }

    @Override
    public String getShapeName() {
        return "Hexagon";
    }
}
