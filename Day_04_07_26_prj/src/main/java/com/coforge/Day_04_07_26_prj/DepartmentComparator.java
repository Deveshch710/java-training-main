package com.coforge.Day_04_07_26_prj;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
    }
}