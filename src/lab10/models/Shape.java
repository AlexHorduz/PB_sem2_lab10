package lab10.models;

public abstract class Shape {
    private double perimeter;
    private double area;

    Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }


    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }
}