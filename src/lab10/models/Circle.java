package lab10.models;

import java.util.Comparator;

public class Circle extends Shape {
    private double radius;
    private static double PI = 3.14;

    public Circle() {
        super(2 * PI, PI);
        this.radius = 1;
    }

    public Circle(double radius) {
        super(2 * PI * radius, PI * radius * radius);
        this.radius = radius;
    }

    public static class RadiusComparator implements Comparator<Circle> {
        @Override
        public int compare(Circle c1, Circle c2) {
            return (c1.radius == c2.radius) ? 0 : (c1.radius > c2.radius) ? 1 : -1;
        }
    }

    public void setRadius(double radius) {
        this.radius = radius;
        super.setArea(PI * radius * radius);
        super.setPerimeter(2 * PI * radius);
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle))
            return false;

        Circle other = (Circle) o;

        if (this.radius == other.getRadius())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return ("Circle: radius = " + String.valueOf(radius));
    }
}