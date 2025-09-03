class Animal {
  final String name;
  Animal(this.name);

  void speak() {
    print('$name makes a sound');
  }
}

class Dog extends Animal {
  Dog(String name) : super(name);

  @override
  void speak() {
    print('$name barks');
  }
}

void run() {
  var a = Animal('Generic');
  var d = Dog('Buddy');
  a.speak(); // Generic makes a sound
  d.speak(); // Buddy barks
}