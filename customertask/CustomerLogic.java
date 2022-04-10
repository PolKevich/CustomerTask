package by.training.task03.customertask;

import java.util.ArrayList;

public class CustomerLogic {
    public ArrayList<Customer> bubblesSort(ArrayList<Customer> list) {
        boolean sorted = false;
        Customer temp;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getSurname().compareTo(list.get(i + 1).getSurname()) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;

                }
            }
        }
        return list;
    }

    public ArrayList<Customer> interval(int min, int max) {
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer c : AggregatingMass.getList()) {
            if (c.getCreditCardNumber() > min && c.getCreditCardNumber() < max) {
                list.add(c);

            }
        }
        return list;
    }
}
