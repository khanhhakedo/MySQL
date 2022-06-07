package com.vti.entity;

import java.time.LocalDate;
import java.util.Comparator;

public class StudentExercise2 implements Comparator<StudentExercise2> {
    private int id;
    private  String name;
    private LocalDate birthday;
    private  float diem;
    private static int Count = 0;

    public StudentExercise2( String name) {
        this.id = ++ Count;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }


    @Override
    public String toString() {
        return "StudentExercise: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", diem=" + diem +
                '}';
    }


    @Override
    public int compare(StudentExercise2 st1, StudentExercise2 st2) {
        if (st1 == null) {
            return  -1;
        }if (st2 == null) {
            return  1;
        }
        return st1.getName().compareTo(st2.getName());
    }


    @Override
    public boolean equals(Object a) {
        if (a == null) {
            return false;
        }
        StudentExercise2 studentExercise2 = (StudentExercise2) a;
        if (studentExercise2.equals(studentExercise2.getName())){
            return true;
        }
        return false;
    }


}
