public class Abstraction {
    static abstract class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        private double r;
        public Circle(double r) { this.r = r; }
        @Override
        double area() { return Math.PI * r * r; }
    }

    static class Rectangle extends Shape {
        private double w, h;
        public Rectangle(double w, double h) { this.w = w; this.h = h; }
        @Override
        double area() { return w * h; }
    }

    public static void run() {
        Shape c = new Circle(2);
        Shape r = new Rectangle(3, 4);
        System.out.println("Circle area = " + c.area());
        System.out.println("Rectangle area = " + r.area());
    }
}
