abstract class Shape {
  double area();
}

class Circle extends Shape {
  final double r;
  Circle(this.r);

  @override
  double area() => 3.141592653589793 * r * r;
}

class Rectangle extends Shape {
  final double w, h;
  Rectangle(this.w, this.h);

  @override
  double area() => w * h;
}

void run() {
  var circle = Circle(2);
  var rectangle = Rectangle(3, 4);

  print("Circle area = ${circle.area()}");
  print("Rectangle area = ${rectangle.area()}");
}
