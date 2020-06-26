package javaCollections.mainTask;

import javaCollections.mainTask.actionsByTask.CreatureDevices;
//Домашние электроприборы. Определить иерархию электроприборов. Включить некоторые в розетку.
// Подсчитать потребляемую мощность. Провести сортировку приборов в квартире на основе мощности.
// Найти прибор в квартире, соответствующий заданному диапазону параметров.


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        CreatureDevices.addDevice();
        System.out.println("\nSort by power:");
        controller.sortByPower();
        System.out.print("\nTotal power of plugged-in devices:");
        controller.totalPowerConsumption();
        System.out.println("\nSort by power between 900-1700 wat");
        controller.sortByParameters();


    }
}
