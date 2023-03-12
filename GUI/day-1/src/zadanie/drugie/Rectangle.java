package zadanie.drugie;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
