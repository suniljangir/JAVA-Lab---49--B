package com.company;
class Circle
{
    public double radious;
    public double area()
    {
        return Math.PI*radious*radious;
    }
    public double perimeter()
    {
        return Math.PI*2*radious;
    }

}
class Cylinder extends Circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
    public double  cperimeter()
    {
        return perimeter()*height;
    }
}

public class Main {

    public static void main(String[] args) {
        Cylinder c=new Cylinder();

        c.radious=9;
        c.height=23;
        System.out.println("volume of cylinder is "+c.volume());
        System.out.println("Area of cylinder is "+c.area());
        System.out.println("area of cylinder is "+c.cperimeter());
        System.out.println("perimeter of cylinder is "+c.perimeter());

	// write your code here
    }
}
