class Person {
  String name;
  int age;

  Person(this.name, this.age);

  void greet() => print('Hi, I am $name, $age years old.');
}

void run() {
  var p = Person('Abel', 19);
  p.greet();
}
