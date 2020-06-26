package javaClasses;

//        Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
//        Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти
//        данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//
//        Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
//        Создать массив объектов. Вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.


public class CustomerMainClass {

    public static void main(String[] args) {
        Customer[] arr= new Customer[4];

        arr[0] = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Kozhara 1 kv 53",5462728323924745L,37272737277372L);
        arr[1] = new Customer(2, "Petrov", "Petr", "Petrovic", "Gercena 8 kv 5",4247287836378362L, 28462846282L);
        arr[2] = new Customer(3, "Sidorov", "Maks", "Andreevich", "Lenina 4 kv 4", 5647382956473856L, 5647384857292L);
        arr[3] = new Customer(4, "Gur", "Andrey","Andreevich", "Lenina 5 kv 54", 4557385967463756L,657373848384L);

        interval(arr);
        sort(arr);


        }

    public static void sort(Customer[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getName().compareTo(arr[j + 1].getName()) > 0){
                    Customer swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        System.out.println("List of piople sort by name: ");
        for(Customer elem : arr) {
            System.out.println(elem.getName() + " " + elem.getSurname());
        }
    }


    public static void interval(Customer[] arr) {
        System.out.println("Owners of card in set interval: ");
        for (Customer elem : arr)
            if (elem.getNubmerofcreditcard() > 4247287836378362L && elem.getNubmerofcreditcard() < 5647382956473856L) {
                System.out.println(elem.getName() + " " + elem.getSurname());
            }
    }

}



