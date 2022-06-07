package com.vti.backend;

import com.vti.entity.Exercise5.Student_Exercise5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise5_Test implements  Serializable {

    public static void Question1 () throws IOException, ClassNotFoundException {
        List<Student_Exercise5> new1 = new ArrayList<>();

        Student_Exercise5 studentExercise1 = new Student_Exercise5();
        studentExercise1.setId(1);
        studentExercise1.setName("khanh1");

        new1.add(studentExercise1);

        Student_Exercise5 studentExercise2 = new Student_Exercise5();
        studentExercise2.setId(2);
        studentExercise2.setName("khanh2");

        new1.add(studentExercise2);


        Student_Exercise5 studentExercise3 = new Student_Exercise5();
        studentExercise3.setId(3);
        studentExercise3.setName("khanh3");

        new1.add(studentExercise3);


        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\testJava.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new1);
        objectOutputStream.close();

//        doc file

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\Documents\\testJava.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object obj =  objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(studentExercise1.getId());


    }
}
