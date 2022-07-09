package prototypeDemo.shape;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rectangle otherRectangle) || !super.equals(other)) return false;
        return otherRectangle.width == width && otherRectangle.height == height;
    }
}