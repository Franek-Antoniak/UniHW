package zadanie.drugie;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getShapeName();

    @Override
    public String toString() {
        return String.format("Shape: %s, Color: %s, area: %.2f, perimeter: %.2f", getShapeName(), color, getArea(),
                getPerimeter());
    }
}
