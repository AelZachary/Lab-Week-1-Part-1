import java.util.*;

public class Polymorphism {
    interface Animal {
        void speak();
    }

    static class Dog implements Animal {
        @Override public void speak() { System.out.println("Rawrr~"); }
    }

    static class Cat implements Animal {
        @Override public void speak() { System.out.println("Nyeahh~"); }
    }

    static void makeAllSpeak(List<Animal> animals) {
        for (Animal a : animals) {
            a.speak();
        }
    }

    public static void run() {
        List<Animal> animals = Arrays.asList(new Dog(), new Cat());
        makeAllSpeak(animals);
    }
}
