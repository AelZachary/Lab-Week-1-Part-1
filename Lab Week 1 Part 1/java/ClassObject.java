public class ClassObject {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void greet() {
            System.out.println("Hi, I am " + name + ", " + age + " years old.");
        }
    }

    public static void run() {
        Person p = new Person("Abel", 19);
        p.greet();
    }
}
