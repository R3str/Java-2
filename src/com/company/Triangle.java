package com.company;

public class Triangle implements IMethods
{
    private double[] sides = new double[3];
    private double[] angles = new double[3];
    private double perimeter;
    private double square;

    public Triangle(double[] sides, boolean rightTriangle)
    {
        setSides(sides);
        setAngles();
        if(rightTriangle)
            setAngles1();
        setPerimeter();
        setSquare();
    }

    public Triangle()
    {
        for (int i = 0; i < SIDES; i++)
            this.sides[i] = 0;
    }

    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }

    public void setAngles() {
        angles[0] = Math.toDegrees( Math.abs( Math.cos(Math.toRadians( (Math.pow(sides[0],2)+Math.pow(sides[2],2)-Math.pow(sides[1],2)) / 2*sides[0]*sides[2]) ) ) );
        angles[1] = Math.toDegrees( Math.abs( Math.cos(Math.toRadians( (Math.pow(sides[0],2)+Math.pow(sides[1],2)-Math.pow(sides[2],2)) / 2*sides[0]*sides[1]) ) ) );
        angles[2] = Math.toDegrees( Math.abs( Math.cos(Math.toRadians( (Math.pow(sides[1],2)+Math.pow(sides[2],2)-Math.pow(sides[0],2)) / 2*sides[2]*sides[1]) ) ) );
    }

    public void setAngles1()
    {
        angles[0] = 90;
    }

    public double[] getAngles() {
        return angles;
    }

    public void setPerimeter() {
        this.perimeter = sides[0] + sides[1] + sides[2];
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setSquare() {
        double halfPerimetr = (sides[0] + sides[1] + sides[2]) / 2;

        this.square = Math.sqrt(halfPerimetr* (halfPerimetr-sides[0])*(halfPerimetr-sides[1])*(halfPerimetr-sides[2]));
    }

    public double getSquare() {
        return square;
    }
}
