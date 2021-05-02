package lab10.models;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        super(4, 1);
        this.setWidth(1);
        this.setHeight(1);
    }

    public Rectangle(double width, double height) {
        super(2 * (width + height), width * height);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        super.setPerimeter((width + height) * 2);
        super.setArea(width * height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        super.setPerimeter((width + height) * 2);
        super.setArea(width * height);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rectangle))
            return false;

        Rectangle other = (Rectangle) o;

        if (this.width == other.getWidth() && this.height == other.getHeight())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return ("Rectangle:  width = " + String.valueOf(width) + "  height = " + String.valueOf(height));
    }
}