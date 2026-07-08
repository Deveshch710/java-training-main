package com.coforge.Day_07_Assignment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {

    private String id;
    private String name;
    private int[] marks;
    private String mobile;
    private String email;
    private String branch;
}