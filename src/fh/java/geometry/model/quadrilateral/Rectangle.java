package fh.java.geometry.model.quadrilateral;

/**
 * Created by johann on 11/1/16.
 */
public class Rectangle extends Square {

    private double sideB;


    public Rectangle() {
    }

    public Rectangle(int x, int y,double sideA, double sideB) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        return Double.compare(rectangle.sideB, sideB) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // TODO: Implement equals() and hashCode()

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {
        return sideA*sideB;
    }

    @Override
    public double calcPerimeter() {
        return 2*(sideA+sideB);
    }

}
