package com.vti.frontend;

import com.vti.entity.Optional.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainStudent extends Student {
    private Random random;

    public static void menu() {
        System.out.println("------------NENU------------");
        System.out.println("1: Tạo danh sách sinh");
        System.out.println("2: Hiển thị ds sv trong lớp ");
        System.out.println("3: Điểm danh ");
        System.out.println("4: Gọi nhóm 1 học bài");
        System.out.println("5: Gọi nhóm 2 đi dọn vệ sinh");
        System.out.println("6: Exit");
        System.out.println("---------------------------------------");
    }

    public MainStudent() {
        List<Student> students = new ArrayList<Student>();
        random = new Random();
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();



    }
}


