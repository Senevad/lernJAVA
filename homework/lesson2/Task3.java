package homework.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) 
        { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = sc.nextLine();  
            System.out.println("Перевернутая строка:");
            reverse(str); 
            sc.close();
        }     
    static void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverse(str.substring(0,str.length()-1)); 
        }         
    }   
}
