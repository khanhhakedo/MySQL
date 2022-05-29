package com.VTI.entity;

import java.util.Arrays;

public class Employee <E >{
    private int id;
    private String name;
    private  static  int COUNT = 0;
    private  E[] salary;

    public Employee( String name, E[] salary) {
        this.id = ++COUNT;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E[] getSalary() {
        return salary;
    }

    public void setSalary(E[] salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" + id +": "+
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + Arrays.toString(salary) +
                '}';
    }
}


