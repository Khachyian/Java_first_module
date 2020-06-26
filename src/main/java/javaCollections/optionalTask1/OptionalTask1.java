package javaCollections.optionalTask1;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

//  Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.


public class OptionalTask1 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        try (Scanner scanFile = new Scanner(new File("c:\\data\\temp\\Java-fundamentals\\src\\main\\java\\javaCollections\\optionalTask1\\optionalTask1.txt"));
             FileWriter writeInFile = new FileWriter(new File("c:\\data\\temp\\Java-fundamentals\\src\\main\\java\\javaCollections\\optionalTask1\\optiona.txt"))) {

            // input in stack
            while (scanFile.hasNextLine()) {
                stack.push(scanFile.nextLine());
            }

            // output from stack to file

            for (int i = 0; i < stack.size(); i++) {
                writeInFile.write(stack.pop() + "\n");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}



