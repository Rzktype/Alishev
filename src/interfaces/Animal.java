package interfaces;

public class Animal implements Info {

    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Animal is sleep");
    }

    public void showInfo() {
        System.out.println("Id is " + this.id);

    }

}
