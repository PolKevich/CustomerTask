package by.training.task03.customertask;
/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив или коллекцию типа Customer,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class CustomerMain {

    public static void main(String[] args) {

        Customer c1 = new Customer(100100, "Пушкин", "Александр", "Сергеевич",
                "ул. Царскосельская", 44448888, 123456789);
        Customer c2 = new Customer(105105, "Толстой", "Лев", "Николаевич",
                "ул. Яснополянская", 22226666, 112233445);
        Customer c3 = new Customer(110110, "Булгаков", "Михаил", "Афанасьевич",
                "ул. Воздвиженская", 33337777, 334455667);

        AggregatingMass.addList(c1);
        AggregatingMass.addList(c2);
        AggregatingMass.addList(c3);

        PrintCustomer printCustomer = new PrintCustomer();
        System.out.println("Список всех Customer:");
        printCustomer.print(AggregatingMass.getList());
        System.out.println();

//a) список покупателей в алфавитном порядке;

        CustomerLogic logic = new CustomerLogic();
        System.out.println("Список всех Customer после сортировки:");
        printCustomer.print(logic.bubblesSort(AggregatingMass.getList()));
        System.out.println();

//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

        printCustomer.print(logic.interval(10000000, 40000000));

    }
}
