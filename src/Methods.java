public class Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 50;
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("The first person to retire: " + year1 + " years");
        System.out.println("The second person to retire: " + year2 + " years");
        // retire - пенсия
    }
}

class Person {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;      // после return метод прекращает свою работу
    }
/*    void calculateYearsToRetirement(){   Данный метод ничего не возвращает
        int years = 65-age;
        System.out.println("number of years before retirement "+years);
    } */

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", I'm " + age + " years old");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
