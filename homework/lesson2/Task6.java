package homework.lesson2;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Task4.Task());
        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
    
}
