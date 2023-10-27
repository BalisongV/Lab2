package ru.mirea.lab2;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(){
        this.radius = 0.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        double a = PI * radius * radius;
        return a;
    }

    public double circleLength(){
        double c = 2 * PI * radius;
        return c;
    }
    public String compareCircles(double another_radius){
        if (radius > another_radius){
            return "Your circle is bigger.";
        }
        if (radius < another_radius){
            return "Another circle is bigger.";
        }else{
            return "Circles are equal.";
        }
    }
}
