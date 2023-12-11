package o;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI*radius*radius;
    }
}
