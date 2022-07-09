/**
 *
 */
package prototypeDemo.shape;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Shape otherShape)) return false;
        return otherShape.x == x && otherShape.y == y && Objects.equals(otherShape.color, color);
    }
}
