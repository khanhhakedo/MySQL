package com.VTI.entity;

public class Department {
    public static int count;
    private int id;
    private String name;
    public Department(String name) {
        super();
        count++;
        this.id = count;
        this.name = name;
    }
    @Override
    public String toString() {
        return "DepartmentID [id=" + id + ", name=" + name + "]";

    }

}
