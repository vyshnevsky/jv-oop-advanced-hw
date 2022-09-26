package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String drawFigure() {
        return ("Figure: Circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}