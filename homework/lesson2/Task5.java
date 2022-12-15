package homework.lesson2;

public class Task5 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Task4.Task());
        int tmp = builder.indexOf("=");
        builder.deleteCharAt(tmp);
        builder.insert(tmp, "равно");
        System.out.println(builder.toString());
    }
}
