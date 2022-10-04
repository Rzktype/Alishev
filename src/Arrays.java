public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных; коробка в ней лежит 10
//        char character = 'a'; // примитивный тип данных

//        String s = "Hello"; // ссылочный тип данных
//        String s1 = new String("Hello");

        int[] numbers = new int[5]; // numbers -> ссылается на [массив] Ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) { //        System.out.println(numbers[4]); отчет идёт с нуля в этом массиве лежат 0 1 2 3 4
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3}; // если заранее знаем что хотим поместить в массив
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
