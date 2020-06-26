package javaFundamentals;
public class JavaFundMainTask3 {

//    Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public static void main(String args[]){
        int i;
    int [] array = new int[] {3,6,8,4};
        System.out.println("In column: ");
    for(i=0; i<=array.length-1; i++){
        System.out.println(" "+ array[i]);
    }
        System.out.print("In line: ");
        for(i=0; i<=array.length-1; i++){
            System.out.print(" "+ array[i]);
        }
    }


}
