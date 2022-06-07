package com.vti.entity.Static_Test;

public class Student_2 {
    private  int id;
    private  String name;
    private static String college  = "Đại học bách khoa";
    private  static  float moneyGroup = 100;

    public static float getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(float moneyGroup) {
        Student_2.moneyGroup = moneyGroup;
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

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student_2.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", name: " + name +
                ", college: "  + college +
                ", moneyGroup: " + moneyGroup;
    }
}
