package by.training.task03.customertask;

import java.util.ArrayList;

public class AggregatingMass {

    private static final ArrayList<Customer> list = new ArrayList<>();

    private AggregatingMass(){

    }

    public static void addList(Customer c) {
        list.add(c);

    }

    public static ArrayList<Customer> getList() {
        return list;
    }

}
