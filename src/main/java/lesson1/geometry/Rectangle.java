package lesson1.geometry;

public class Rectangle {
    // добавьте свойства se и nw - юго восточная точка и северозападная
    Point se;
    Point nw;

    // добавьте конструктор
    public Rectangle(Point se, Point nw) {
        this.se = se;
        this.nw = nw;
    }

    // геттеры и сеттеры
    public Point getSe() {
        return se;
    }

    public void setSe(Point se) {
        this.se = se;
    }

    public Point getNw() {
        return nw;
    }

    public void setNw(Point nw) {
        this.nw = nw;
    }

    double area() {
        // вернуть площадь
        double a = se.getX() - nw.getX();
        double b = nw.getY() - se.getY();
        return a * b;
    }
}