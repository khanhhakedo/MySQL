package com.VTI.backend;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class File_Test {

//    Question 1:
    public static void Question1() {
        File file = new File("C:\\Users\\pc\\Desktop\\Test.txt");
        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            System.out.println("File not exists!");
        }
    }

    //    Question 2:
    public static void Question2() throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Documents\\Test.txt");
        file.createNewFile();
        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            System.out.println("File not exists!");
        }
    }

    //    Question 4:
    public static void Question4(){
        File file = new File("C:\\Users\\ADMIN\\Documents\\Test.txt");
        if (file.delete()) {
            System.out.println("File Delete!");
        } else {
            System.out.println("File not Delete!");
        }

        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            System.out.println("Error! File Not Exist!");
        }
    }


    //    Question 5:
    public static void Question5(){
        File file = new File("C:\\Users\\ADMIN\\Documents");
        if (file.isDirectory()) {
            System.out.println("Folder!");
        } else {
            System.out.println("File!");
        }
    }


    //    Question 6:
    public static void Question6(){
        File file = new File("C:\\Users\\ADMIN\\Documents");
        if (file.isDirectory()) {
            System.out.println("Folder!");
        } else {
            System.out.println("Error! Path is not folder!");
        }

        for (String fileName : file.list()) {
            System.out.println(fileName);
        }
    }


    //    Question 7:
    public static void Question7() throws IOException {
        File source = new File("C:\\Users\\ADMIN\\Documents\\Test.txt");
        if (source.exists()) {
            System.out.println("File source exists!");
            File dest = new File("C:\\Users\\ADMIN\\Documents\\Test2.txt");
            if (dest.exists()) {
                System.out.println("File dest exists!");
            } else {
                System.out.println("Dest File Not Exist!");
                Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        } else {
            System.out.println("Error! Source File Not Exist!");
        }
    }


    //    Question 8:
    public static void Question8(){
        // Move file
        File file = new File("C:\\Users\\ADMIN\\Documents\\Test.txt");
        if (file.exists()) {
            System.out.println(" File goc is exists!");
            boolean moveFile = file.renameTo(new File("C:\\Users\\ADMIN\\Documents\\File bai tap\\Test.txt"));

            File newFilefile = new File("C:\\Users\\ADMIN\\Documents\\File bai tap\\Test.txt");

            if (newFilefile.exists()) {
                System.out.println(" Move File thanh cong!");
            } else {
                System.out.println("Error! Move File that bai!");
            }
        } else {
            System.out.println("Error! File is not exists!");
        }

    }


    //    Question 9:
    public static void Question9() {
        File oldfile = new File("C:\\Users\\ADMIN\\Documents\\File bai tap\\Test.txt");
        File newfile = new File("C:\\Users\\ADMIN\\Documents\\File bai tap\\Test1.txt");

        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename succesful");
        } else {
            System.out.println("Rename failed");
        }
    }

}



