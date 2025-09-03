public class Inheritance {
    static class Animal {
        protected String name;
        public Animal(String name) { this.name = name; }
        public void speak() {
            System.out.println(name + " makes a sound");
        }
    }

    static class Dog extends Animal {
        public Dog(String name) { super(name); }
        @Override
        public void speak() {
            System.out.println(name + " barks");
        }
    }

    public static void run() {
        Animal a = new Animal("Generic");
        Dog d = new Dog("Buddy");
        a.speak();
        d.speak();
    }
}
