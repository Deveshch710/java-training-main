package com.coforge.Day_04_07_26_prj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double salary;
    private String department;
    private String city;

    @Override
    public int compareTo(Employee other) {

        // Compare department
        int deptCompare = this.department.compareTo(other.department);

        // If department is same, compare city
        if (deptCompare == 0) {
            int cityCompare = this.city.compareTo(other.city);

            // If city is also same, compare name
            if (cityCompare == 0) {
                return this.name.compareTo(other.name);
            }

            return cityCompare;
        }

        return deptCompare;
    }
}