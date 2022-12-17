// 1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3.Вставить элемент в список в первой позиции.
// 4.Извлечь элемент (по указанному индексу) из заданного списка.
// 5.Обновить определенный элемент списка по заданному индексу.
// 6.Удалить третий элемент из списка.
// 7.Поиска элемента в списке по строке.
// 8.Создать новый список и добавить в него несколько елементов первого списка.
// 9.Удалить из первого списка все элементы отсутствующие во втором списке.
// 10.*Сортировка списка.
// 11.*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

package homework.lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Task1();
        Task2(Task1());
        Task3(Task1());
        Task4(Task1());
        Task5(Task1());
        Task6(Task1());
        // Task7(Task1());
        Task8(Task1());
        Task9(Task1(), Task8(Task1()));        
    }

    public static ArrayList<StringBuilder> Task1() {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Red"));
        list.add(new StringBuilder("Green"));
        list.add(new StringBuilder("Blue"));
        list.add(new StringBuilder("Yellow"));
        list.add(new StringBuilder("Pink"));
        list.add(new StringBuilder("Grey"));
        System.out.println(list);
        return list;
    }

    public static void Task2(ArrayList<StringBuilder> list) {
        list.forEach(n -> n.append("!"));
        System.out.println(list);        
    }

    public static void Task3(ArrayList<StringBuilder> list) {
        list.add(0, new StringBuilder("White"));
        System.out.println(list);        
    }
    public static void Task4(ArrayList<StringBuilder> list) {
        System.out.println("Элемент по индексу 2: " + list.get(2));        
    }

    public static void Task5(ArrayList<StringBuilder> list) {
        list.set(2, new StringBuilder("Black"));
        System.out.println("Изменил элемент по индксу 2: \n" +list);        
    }

    public static void Task6(ArrayList<StringBuilder> list) {
        list.remove(2);
        System.out.println(list);           
    }

    public static void Task7(ArrayList<StringBuilder> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомую строку: ");
        StringBuilder findStr = new StringBuilder(scanner.next());
        scanner.close();
        if (list.indexOf(findStr) >= 0) {
            System.out.println("Индекс искомого элемента: \n" +list.indexOf(findStr));
        }
        else System.out.println("такой строки нет");
    }
    public static ArrayList<StringBuilder> Task8(ArrayList<StringBuilder> list) {
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(list.get(1));
        list2.add(list.get(4));
        list2.add(list.get(5));
        System.out.println(list2);
        return list2;        
    }
    public static void Task9(ArrayList<StringBuilder> list, ArrayList<StringBuilder> list2) {
        list.retainAll(list2);
        System.out.println(list);        
    }
}
