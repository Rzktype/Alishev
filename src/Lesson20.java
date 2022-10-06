public class Lesson20 {
    public static void main(String[] args) {
        People people1 = new People("asd");
        System.out.println(people1);
    }
}

class People {
    private String name;
    private int age;

    public People() {
        this.name = "Введите имя, возраст= ";
        this.age = 0;
//        System.out.println("Привет из первого конструктора!"); // вызовется при пустом значении в 3 строчке кода
    }

    public People(String name) {
        System.out.println("Привет из второго конструктора!"); // вызовется при значении строка в 3 строчке кода
        this.name = name;
    }

    public People(String name, int age) {
        System.out.println("Привет из третьего конструктора!"); // вызовется при значение строка + число в 3 строчке кода
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
