public class Lesson24 {
    public static void main(String[] args) {
        String string = "Hello";
        Human2 h1 = new Human2("Denis",40);
        System.out.println(h1.toString());
    }
}
class Human2{
    private String name;
    private int age;

    public Human2(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return name+","+age;
    }
}

