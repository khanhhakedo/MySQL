package com.vti.frontend;

import com.vti.entity.Abstraction.News;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertNews extends News {


    public static void main(String[] args) {


        menuChuongTrinh();
        byte x;
        int n;
        Scanner scanner = new Scanner(System.in);
        List<InsertNews> insertNews1 = new ArrayList<>();
        do {
            x = scanner.nextByte();

            switch (x) {
                case 1:
                    InsertNews insertNews = new InsertNews();
                    System.out.println("-------------------------");

                    insertNews.setTitle(scanner.nextLine());

                    System.out.println("Nhập Title: ");

                    insertNews.setTitle(scanner.nextLine());

                    System.out.println("Nhập PublishDate: ");
                    insertNews.setPublishDate(scanner.nextLine());

                    System.out.println("Nhập Author: ");
                    insertNews.setAuthor(scanner.nextLine());

                    System.out.println("Nhập Content: ");
                    insertNews.setContent(scanner.nextLine());

                    System.out.println("Nhập 3 đánh giá bài viết ( thang điểm từ 0 đến 10)");

                    System.out.println("Mức điểm đánh giá thứ nhất: ");

                    int rate1 = scanner.nextInt();
                    System.out.println("Mức điểm đánh giá thứ hai: ");

                    int rate2 = scanner.nextInt();
                    System.out.println("Mức điểm đánh giá thứ ba: ");

                    int rate3 = scanner.nextInt();

                    insertNews.rates = new int[]{rate1, rate2, rate3};
                    insertNews.Calculate();

                    insertNews1.add(insertNews);

                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");
                    menuChuongTrinh();

                    break;

                case 2:
                    System.out.println("Thông tin các tác phẩm là: ");
                    for (InsertNews insertNews2 : insertNews1) {
                        insertNews2.Display();
                        System.out.println("---------------------------------------");
                        System.out.println();
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");
                    menuChuongTrinh();

                    break;

                case 3:
                    for (InsertNews insertNews2 : insertNews1) {
                    	System.out.println("Title: " + insertNews2.getTitle());
                        System.out.println("Điểm đánh giá của tác phẩm là: " + insertNews2.Calculate());
                        System.out.println("---------------------------------------");
                        System.out.println();
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");
                    menuChuongTrinh();
                    break;

                case 4:

                    System.out.println("------------Exit------------");

                    return;
                default:

                    System.out.println("Ban nhap sai roi! moi nhap lai");
                    System.out.println("---------------------------------------");
                    System.out.println("-----Nhập chức năng tiếp theo-----");
                    menuChuongTrinh();

                    break;

            }
        } while (x != 0);
        scanner.close();


    }

    public static void menuChuongTrinh() {
        System.out.println("---------------MENU---------------");
        System.out.println("1: Insert news");
        System.out.println("2: View list news");
        System.out.println("3: Average rate");
        System.out.println("4: Exit");
        System.out.println("----------------------------");
    }
}
