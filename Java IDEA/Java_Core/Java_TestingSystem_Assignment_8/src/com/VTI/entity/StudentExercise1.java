package com.VTI.entity;

public class StudentExercise1 {
    private  int id ;
    private  String name;
    private  static int Count = 0;

    public StudentExercise1(String name) {
        this.name = name;
        this.id = ++ Count;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
