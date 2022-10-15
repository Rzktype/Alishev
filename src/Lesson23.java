public class Lesson23 {
    public static void main(String[] args) {

        /*
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " Friend";
        String stringall = string1 + string2 + string3;
        System.out.println(stringAll);
         */
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend.");
        System.out.println(sb.toString());


        // Форматирование строк souf
//        System.out.printf("%fThis is %s a string, %d", 10.4, "LOL", 75);
        System.out.printf("String %10d\n", 523);
        System.out.printf("String %10d\n", 1000000000);
        System.out.printf("String %-10d\n", 100000);
        System.out.printf("String %.2f\n", 52.3);
        System.out.printf("String %.4f\n", 52.3);


    }
}