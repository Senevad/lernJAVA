package homework.lesson2;

public class Task2 {
    public static void main (String[] args)
    {
        String str1 = "make";
        String str2 = "kema";
  
        if (areRotations(str1, str2))
            System.out.println("Строки являются вращением друг друга");
        else
            System.out.printf("Строки не являются вращением друг друга");
    }

    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }
}
