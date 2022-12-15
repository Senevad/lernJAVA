package homework.lesson2;

public class Task7 {
    public static void main(String[] args) {
        StringBuilder mainStr = new StringBuilder(); 
        for (int i = 0; i < 10000000; i++) {
            mainStr.append('=');         
        }
        long time = System.currentTimeMillis();
        mainStr.toString().replaceAll("=", "равно");
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        mainStr.replace(0, 10000000, "равно");
        System.out.println(System.currentTimeMillis() - time);
    }
    
}
