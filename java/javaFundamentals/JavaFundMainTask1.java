package javaFundamentals;
import java.util.Scanner;

// Приветствовать любого пользователя при вводе его имени через командную строку.

public class JavaFundMainTask1 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name= in.nextLine();

        System.out.println("Hello " + name);

        in.close();
    }
}
