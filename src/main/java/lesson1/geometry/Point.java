package lesson1.geometry;

public class Point {
    // добавьте точки x и y в виде свойств
    private double x;
    private double y;

    // конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // геттеры и сеттеры
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
