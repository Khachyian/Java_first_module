package javaFundamentals;
import java.util.Scanner;

 //Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class JavaFundMainTask2 {
    public static void main (String args[]){
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        int i=0;
        for (i=0; i<5; i++){
            System.out.print("Input a number arg[" +i+ "]=");
          array[i] = in.nextInt();
        }

        for (i=array.length-1; i>=0; i--){
            System.out.println("Arg = " +array[i]);
        }


    }
}
