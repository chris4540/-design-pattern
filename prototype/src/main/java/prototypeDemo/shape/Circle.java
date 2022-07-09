package prototypeDemo.shape;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Circle) || !super.equals(other)) return false;
        return ((Circle) other).radius == radius;
    }
}