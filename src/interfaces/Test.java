package interfaces;

public class Test {
    public static void main(String[] args) {
     Info info1 = new Animal(1);
     Info info2 = new Person("John");
     info1.showInfo();
     info2.showInfo();

     outputInfo(info1);
     outputInfo(info2);

     Animal animal2 = new Animal(2);
     Person person2 = new Person("Tony");
        outputInfo(animal2);
        outputInfo(person2);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
