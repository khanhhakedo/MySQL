package com.VTI.backend;


import com.VTI.entity.Static_Test.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Static_Test {


    public static void Question_1() {
        Student_1 student1 = new Student_1();
        student1.setId(1);
        student1.setName("Nguyen Van A");

        Student_1 student2 = new Student_1();
        student2.setId(2);
        student2.setName("Nguyen Van B");

        Student_1 student3 = new Student_1();
        student3.setId(3);
        student3.setName("Nguyen Van C");


        Student_1[] students = new Student_1[]{student1, student2, student3};


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----------------------------------");
        Student_1.setCollege("Đại học công nghệ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }

    public static void Question_2() {
        Student_2 student1 = new Student_2();
        student1.setId(1);
        student1.setName("Nguyen Van A");

        Student_2 student2 = new Student_2();
        student2.setId(2);
        student2.setName("Nguyen Van B");

        Student_2 student3 = new Student_2();
        student3.setId(3);
        student3.setName("Nguyen Van C");


        Student_2[] students = new Student_2[]{student1, student2, student3};

        System.out.println("Các sinh viên nộp quỹ, mỗi bạn 100K: ");
        Student_2.setMoneyGroup(students.length * 100);
        System.out.println("Tổng quỹ: " + Student_2.getMoneyGroup());

        System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan: ");
        Student_2.setMoneyGroup(students.length * 100 - 50);
        System.out.println("Tổng quỹ: " + Student_2.getMoneyGroup());

        System.out.println("Student thứ 2 lấy 20k đi mua bánh mì: ");
        Student_2.setMoneyGroup(students.length * 100 - 50 - 20);
        System.out.println("Tổng quỹ: " + Student_2.getMoneyGroup());

        System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");
        Student_2.setMoneyGroup(students.length * 100 - 50 - 20 - 150);
        System.out.println("Tổng quỹ: " + Student_2.getMoneyGroup());


        System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k: ");
        Student_2.setMoneyGroup(students.length * 100 - 50 - 20 - 150 + students.length * 50);
        System.out.println("Tổng quỹ: " + Student_2.getMoneyGroup());


    }

    public static void Question_3() {

        int[] numbers = {5, 7};

        int maxValue = numbers[0];
        int minValue = numbers[0];
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }

            for (int num : numbers) {
                sum = sum + num;
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(sum);
    }


    public static void Question_5() {
        byte x = 0;
        Scanner scanner = new Scanner(System.in);
        List<Student_5> insertNews1 = new ArrayList<>();
        int n = 0;
        System.out.println("----MENU----");
        System.out.println("Thoat: 0");
        System.out.println("Nhap thong tin hoc sinh : 1 ");
        System.out.println("Xem so hoc sinh da nhap: 2");


        do {
            x = scanner.nextByte();
            switch (x) {
                case 1:
                    Student_5 insertNews = new Student_5();
                    System.out.println("-------------------------");

                    System.out.println("Nhập id: ");
                    insertNews.id = scanner.nextInt();

                    System.out.println("Nhập name: ");
                    insertNews.name = scanner.next();

                    System.out.println("Nhập class: ");
                    insertNews.clazz = scanner.next();

                    insertNews1.add(insertNews);

                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");

                    System.out.println("----MENU----");
                    System.out.println("Thoat: 0");
                    System.out.println("Nhap thong tin hoc sinh : 1 ");
                    System.out.println("Xem so hoc sinh da nhap: 2");

                    break;

                case 0:

                    System.out.println("------------Exit------------");

                    return;
                case 2:
                    System.out.println("So hoc sinh la: " + insertNews1.toArray().length);
                default:

                    System.out.println("Ban nhap sai roi! moi nhap lai");
                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");

                    System.out.println("----MENU----");
                    System.out.println("Thoat: 0");
                    System.out.println("Nhap thong tin hoc sinh : 1 ");
                    System.out.println("Xem so hoc sinh da nhap: 2");
                    break;
            }
        } while (x != 0);
    }


//
    public static void Question_6() {
        byte x = 0;
        Scanner scanner = new Scanner(System.in);
        List<Student_5> insertNews1 = new ArrayList<>();

        List<Student_5> insertNews2 = new ArrayList<>();

        int n = 0;
        int i = 0;
        int y = 0;
        int a = 0;
        System.out.println("----MENU ----");
        System.out.println("Thoat: 0");
        System.out.println("Nhap thong tin hoc sinh : 1 ");
        System.out.println("Xem so hoc sinh da nhap: 2");


        do {
            x = scanner.nextByte();
            switch (x) {
                case 1:
                    System.out.println("Nhap thong tin PrimaryStudent: 4");
                    System.out.println("Nhap thong tin SecondaryStudent: 5");
                    System.out.println("thoat : 6");

                    do {
                        i = scanner.nextInt();
                        switch (i) {
                            case 4:

                                Student_5 insertNew1s = new PrimaryStudent();
                                System.out.println("-------------------------");

                                System.out.println("Nhập id: ");
                                insertNew1s.id = scanner.nextInt();

                                System.out.println("Nhập name: ");
                                insertNew1s.name = scanner.next();

                                System.out.println("Nhập class: ");
                                insertNew1s.clazz = scanner.next();

                                insertNews1.add(insertNew1s);

                                System.out.println("---------------------------------------");
                                System.out.println("-----Nhập chức năng tiếp theo-----");

                                System.out.println("Nhap thong tin PrimaryStudent: 1");
                                System.out.println("Nhap thong tin SecondaryStudent: 2");
                                System.out.println("Thoat: 6");

                                break;

                            case 5:
                                Student_5 insertNew2s = new SecondaryStudent();
                                System.out.println("-------------------------");

                                System.out.println("Nhập id: ");
                                insertNew2s.id = scanner.nextInt();

                                System.out.println("Nhập name: ");
                                insertNew2s.name = scanner.next();

                                System.out.println("Nhập class: ");
                                insertNew2s.clazz = scanner.next();

                                insertNews2.add(insertNew2s);


                                System.out.println("---------------------------------------");
                                System.out.println("-----Nhập chức năng tiếp theo-----");

                                System.out.println("Nhap thong tin PrimaryStudent: 1");
                                System.out.println("Nhap thong tin SecondaryStudent: 2");
                                System.out.println("Thoat: 6");
                                break;



                            default:
                                System.out.println("Ban nhap sai roi! moi nhap lai");
                                System.out.println("---------------------------------------");
                                System.out.println("-----Nhập chức năng tiếp theo-----");

                                System.out.println("Nhap thong tin PrimaryStudent: 4");
                                System.out.println("Nhap thong tin SecondaryStudent: 5");
                                System.out.println("Thoat: 6");
                        }
                    }while (i < 6);


                case 0:

                    System.out.println("------------Exit------------");

                    return;
                case 2:

                    System.out.println("So hoc sinh PrimaryStudent: 7 ");
                    System.out.println("So hoc sinh SecondaryStudent: 8 ");
                    System.out.println("thoat: 9");
                    do {
                        switch (y) {
                            case 7:
                                System.out.println("So hoc sinh la: " + insertNews1.toArray().length);
                                System.out.println("---------------------------------------");
                                System.out.println("-----Nhập chức năng tiếp theo-----");
                                System.out.println("So hoc sinh PrimaryStudent: 7 ");
                                System.out.println("So hoc sinh SecondaryStudent: 8 ");
                                System.out.println("Thoat : 9");

                            case 8:
                                System.out.println("So hoc sinh la: " + insertNews2.toArray().length);
                                System.out.println("-----Nhập chức năng tiếp theo-----");
                                System.out.println("So hoc sinh PrimaryStudent: 7 ");
                                System.out.println("So hoc sinh SecondaryStudent: 8 ");
                                System.out.println("Thoat : 9");
                            case 9:

                                System.out.println("------------Exit------------");

                        }

                    }while (y != 9);
                default:

                    System.out.println("Ban nhap sai roi! moi nhap lai");
                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");

                    System.out.println("----MENU----");
                    System.out.println("Thoat: 0");
                    System.out.println("Nhap thong tin hoc sinh : 1 ");
                    System.out.println("Xem so hoc sinh da nhap: 2");
                    break;
            }
        } while (x != 0);

    }

}


