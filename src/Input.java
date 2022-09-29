import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // String string = new String("Example!");
        Scanner s = new Scanner(System.in);
//        System.out.println("введите что-нибудь");
        // String string = s.nextLine();
        // System.out.println("вы ввели "+string);
        System.out.println("введите какое-нибудь число");
        int x = s.nextInt();
        System.out.println("вы ввели "+x);
    }
}
