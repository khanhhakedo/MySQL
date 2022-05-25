package com.VTI.entity.Static_Test;

import java.io.Serializable;

public class Student_1 implements Serializable {
    private  int id;
    private  String name;
    private static String college  = "Đại học bách khoa";

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

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student_1.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", name: " + name +
                ", college: "  + college;
    }
}

