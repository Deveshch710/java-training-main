package com.coforge.Day_04_07_26_prj;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getCity().compareToIgnoreCase(e2.getCity());
    }
}