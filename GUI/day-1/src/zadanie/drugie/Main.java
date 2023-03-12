package zadanie.drugie;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(5, "red");
        shapes[1] = new Rectangle(5, 10, "blue");
        shapes[2] = new Circle(5, "green");
        shapes[3] = new Triangle(5, 11, 15, "yellow");
        shapes[4] = new Hexagon(5, "black");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}



