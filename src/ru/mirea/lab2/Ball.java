package ru.mirea.lab2;

public class Ball {
    private double x;
    private double y;

    //Конструктор без аргументов
    public Ball(){
        this.x = 0.0;
        this.y = 0.0;
    }

    // Параметризованный конструктор
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x = x + xDisp;
        y = y + yDisp;
    }

    @Override
    public String toString() {
        return String.format("x: %s y: %s", x, y);

    }
}

