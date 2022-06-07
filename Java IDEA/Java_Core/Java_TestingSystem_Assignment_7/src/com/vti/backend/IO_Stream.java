package com.vti.backend;

import com.vti.entity.Static_Test.Student_1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IO_Stream {
    //    Question 1: doc file
    public static void Question1() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\Documents\\testJava.txt");
        File file = new File("C:\\Users\\ADMIN\\Documents\\testJava.txt");
        if (file.exists()) {
            System.out.println("File exists!");
            byte[] b = new byte[2048];
            int length = fileInputStream.read(b);

            while (length > -1 ) {
                String content = new String(b, 0, length);
                System.out.println(content);

                length = fileInputStream.read(b);
            }


        } else {
            System.out.println("File not exists!");
        }

    }
    //    Question 2: ghi file
    public static void Question2 () throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Documents\\testJava.txt");
        String content = "Nguyen Khanh ";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\testJava.txt", true);
        if (file.exists()) {
            System.out.println("File exists!");

            fileOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        }else {
            System.out.println("File not exists!");
        }
    }

    //    Question 3: ghi file
    public static void Question3 () throws IOException {

        Student_1 student_1 = new Student_1();
        student_1.setId(2);
        student_1.setName("khanh");

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\testJava.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student_1);
        objectOutputStream.close();

    }

}
