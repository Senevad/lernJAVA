// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

package homework.lesson1;

import java.util.Random;

public class lesson1 {
    public static void main(String[] args) {
        int i = Task1();
        System.out.println("задание1: " + i);
        int n = Task2(i);
        System.out.println("задание2: " + n);
        int[] m1 = Task3(n, i);
        System.out.println("задание3 первое число в массиве: " + m1[0]);
        int[] m2 = Task4(n, i);
        System.out.println("задание4 первое число в массиве: " + m2[0]);
        
    }
    public static int Task1 () {
        int i = new Random().nextInt(2000);
        i -= 1000;
        return i;
    }
    public static int Task2(int inNum) {
        int tmp = Math.abs(inNum);
        int n = Integer.highestOneBit(tmp);
        return n;
    }
    public static int[] Task3(int findNum, int range) {
        int[] m1 = new int[Short.MAX_VALUE];
        int tmp = 0;
        for (;range <= Short.MAX_VALUE; range++) {
            if (range % findNum == 0) {
                m1[tmp] = range;
                tmp++;
            }
        }
        return m1;
    }
    public static int[] Task4(int findNum, int range) {
        int[] m2 = new int[Short.MAX_VALUE + range];
        int tmp = 0;
        for (;range >= Short.MIN_VALUE; range--) {
            if (range % findNum != 0) {
                m2[tmp] = range;
                tmp++;
            }
        }
        return m2;
    }
}
