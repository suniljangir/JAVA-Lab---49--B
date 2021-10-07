package com.company;
class cylinder{
    private double radious;
    private double height;
    public cylinder()
    {
        radious=height=1;
    }
    public cylinder(int r)
    {
       height=1;
       radious=r;

    }

    public cylinder(int r,int h)
    {
        radious=r;
        height=h;
    }
    public double  getradious()
    {
        return radious;
    }

    public double getlength()
    {
      return height;

    }
    public void setradious(int r)
    {
       if(r>0)
           radious=r;
       else
           radious=0;


    }
    public void setheight(int h)
    {
        if(h>0)
            height=h;
        else
            height=0;
    }
    public double area()
    {
        return Math.PI*radious*radious*height;

    }
    public double perimeter()
    {
        return 2*Math.PI*radious*height;
    }



}

public class Main {

    public static void main(String[] args) {
        cylinder c=new cylinder(5,10);
        System.out.println("area:="+c.area());
        System.out.println("perimeter="+c.perimeter());
	// write your code here
    }
}
