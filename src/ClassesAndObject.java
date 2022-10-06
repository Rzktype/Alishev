public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 50;
        System.out.println("My name " + person1.name + "," + "I'm " + person1.age + " years old");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        System.out.println("My name " + person2.name + "," + "I'm " + person2.age + " years old");
    }
}

class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
    String name;
    int age;
}