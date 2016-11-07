package fh.java.geometry.model.quadrilateral;

/**
 * Created by johann on 11/1/16.
 */
public class Square extends QuadrangularShape {

    protected double sideA;

    public Square() {
    }

    public Square(int x, int y,double sideA) {

        this.x=x;
        this.y=y;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return Double.compare(square.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // TODO: Implement equals() and hashCode()

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("sideA=").append(sideA);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {
        return sideA*sideA;
    }

    @Override
    public double calcPerimeter() {
        return 4*sideA;
    }
}
