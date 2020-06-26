package javaFundamentals;
import java.util.Scanner;

//        Задание. Ввести с консоли n - размерность матрицы a [n] [n].
//        Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел
//        (класс Random).
//         Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

public class JavaOptionalTask2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int sizeOfArray = scan.nextInt();
        int[][] array = new int[sizeOfArray][sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] =((int)(Math.random() * 31) - 15);
            }
        }
        for (int i=0;i < array.length;i++,System.out.println()){
            for (int j=0;j < array[i].length;j++){
                System.out.print(array[i][j]+"  ");
            }
        }
        sort(array,sizeOfArray);
    }

    public static void sort(int[][] array, int sizeOfArray){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input column for sort: ");
        String columnOfSort = scan.nextLine();
        int e= Integer.parseInt(columnOfSort);
        e--;


        System.out.println("Result:");

        for (int i=0;  i<sizeOfArray; i++) {
            for (int k = i + 1; k < sizeOfArray; k++) {
                if (array[i][e] > array[k][e]) {
                    for (int j = 0; j < sizeOfArray; j++) {
                        int temp = array[i][j];
                        array[i][j] = array[k][j];
                        array[k][j] = temp;
                    }
                }
            }
        }


        for (int i=0; i<sizeOfArray; i++)
        {
            for (int j=0; j<sizeOfArray; j++)
            {
                System.out.print(array[i][j]+"   ");
            }
            System.out.print("\n");
        }



}






}
