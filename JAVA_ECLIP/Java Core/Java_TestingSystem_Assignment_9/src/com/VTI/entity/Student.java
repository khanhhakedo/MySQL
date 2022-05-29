package com.VTI.entity;

public class Student {
    private int  id;
    private static  int Count = 0;
    private String name;

    public Student(String name) {
        this.name = name;
        this.id = ++ Count;
    }

@Deprecated
    public int getId() {
        return id;
    }

    public String getID(){
        return "MSV: " + id;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
