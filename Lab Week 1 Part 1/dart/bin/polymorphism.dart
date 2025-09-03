abstract class Animal {
  void speak();
}

class Dog implements Animal {
  @override
  void speak() => print('Rawrr~');
}

class Cat implements Animal {
  @override
  void speak() => print('Nyeahh~');
}

void makeAllSpeak(List<Animal> animals) {
  for (var a in animals) {
    a.speak();
  }
}

void run() {
  var animals = <Animal>[Dog(), Cat()];
  makeAllSpeak(animals);
}