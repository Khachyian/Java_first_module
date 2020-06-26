package javaFundamentals;
import java.util.Scanner;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

public class JavaFundMainTask5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of a month: ");
        int month=in.nextInt();
        if(month>=1 && month<=12) {
            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Fеbruary");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
            else{
                System.out.println("Wrong number");
        }



    }
}
