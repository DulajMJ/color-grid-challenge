import java.util.Objects;

public class ValueXY {

    private int x;
    private int y;

    public ValueXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public ValueXY() {
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueXY valueXY = (ValueXY) o;
        return x == valueXY.x &&
                y == valueXY.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
