package javaFundamentals;
import java.util.Scanner;

//        Ввести n чисел с консоли.
//        Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//        Вывести числа в порядке возрастания (убывания) значений их длины.
//        Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class JavaOptionalTask1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of numbers: ");
        int numberOfNumbers = scan.nextInt();
        String[]array = new String[numberOfNumbers];
        for(int i = 0;i<numberOfNumbers;i++){
            int j=i+1;
            System.out.println("Input " + j + " number");
            array[i]=scan.next();
        }
        minAndMaxNumber(array);
        sort(array);
        smallerAverage(array,numberOfNumbers);
    }
    public static void minAndMaxNumber(String[] array){
        int min = array[0].length();
        int max = 0;
        for(String val:array){
            if(val.length()>max)max=val.length();
            else if(val.length()<min)min=val.length();
        }
        for (String s : array) {
            if (s.length() == max) System.out.println("Max number is " + s + " his length " + s.length());
            else if (s.length() == min) System.out.println("Min number is " + s + " his length " + s.length());
        }
    }
    public static void sort(String[] array){
        System.out.println("Sorting:");
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( array[j].length() > array[j+1].length() ){
                    String swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void smallerAverage(String[] array, int numberOfNumbers){
        int sum=0;
        for(int i =array.length-1; i>=0; i--){
            sum = sum + array[i].length();
        }
        int average = sum / numberOfNumbers;
        System.out.println("Average length: " +average);
        System.out.println("Smaller then average length:");
        for(int i =array.length-1; i>=0; i--) {
            if (array[i].length() < average) {
                System.out.println(array[i]+ " with length "+ array[i].length());
            }
        }
    }





}
