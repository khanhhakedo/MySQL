package com.VTI.backend;

import com.VTI.entity.Student;

import java.util.Date;

public class Exercise2 {

    @SuppressWarnings("deprecation")
    public static void Question1() {
        Date date = new Date("18/5/2020");
        System.out.println(date);
    }

    public static void Question2() {
        Student student1 = new Student("khanh1");

        System.out.println("Thong tin Student1");

        System.out.println(student1);

        System.out.println(student1.getID());
        student1.getId();
        student1.getID();



    }



}
