package chapter4;
import java.math.*;

public class SodaCan {

    private double height;
    private double diameter;

    public SodaCan(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public double getVolume() {
        return Math.PI * Math.pow((diameter/2), 2) * height;
    }

    public double getSurfaceArea() {
        return (2 * Math.PI * (diameter/2) * height) + (2 * Math.PI * Math.pow((diameter/2), 2));
    }

}
