package homework.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task();
    }
    public static StringBuilder Task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        System.out.println(builder.toString());
        scanner.close();
        return builder;
    }
}
