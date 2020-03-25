public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    void Circle(double radius) {
        this.radius=radius;
    }

     double getRadius() {
        return this.radius;
    }

    protected double getArea() {
        return this.radius*this.radius* Math.PI;
    }

}
