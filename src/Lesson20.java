public class Lesson20 {
    public static void main(String[] args) {
        People p1 = new People("Bob", 40);
        p1.printNumberOfPeople();
        People p2 = new People("Tom", 35);
        p2.printNumberOfPeople();
        People p3 = new People("Tomas",28);
        p3.printNumberOfPeople();

    }
}

class People {
    private String name;
    private int age;
    private static int countPeople;

    public People(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

public void printNumberOfPeople(){
    System.out.println("Number of people "+countPeople);
    }
}
