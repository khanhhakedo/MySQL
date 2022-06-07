package com.vti.frontend.Exercise2;

import com.vti.entity.Department;

public class Question4 extends Department {
    public Question4(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Department department1 = new Department("Dep1");
        Department department2 = new Department("Dep2");
        Department department3 = new Department("Dep3");
        Department[] depArray = {department1, department2, department3 };
        try {
            System.out.println(depArray[5]);
        } catch (Exception e) {
            System.err.println("Cannot find department.");
        }
    }
}


