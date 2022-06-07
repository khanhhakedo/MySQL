package com.vti.entity;

public class Department {

    private int id;
    private String name;
    private static int Count  = 0;
    private  int a ;

    public Department() {
this.a = ++Count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department:"  + a +"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
