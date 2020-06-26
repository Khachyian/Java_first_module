package javaFundamentals;
import java.util.Scanner;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class JavaFundMainTask4 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int numberFirst = in.nextInt();

        System.out.print("Input second number: ");
        int numberSecond = in.nextInt();

        int sum = numberFirst + numberSecond;
        int multiply = numberFirst * numberSecond;

        System.out.println("sum=" + sum);
        System.out.println("multiplication=" +multiply);

        in.close();
    }
}


