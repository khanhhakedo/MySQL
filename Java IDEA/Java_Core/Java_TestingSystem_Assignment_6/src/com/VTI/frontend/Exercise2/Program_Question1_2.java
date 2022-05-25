package com.VTI.frontend.Exercise2;

import com.VTI.backend.Exercise2;

import java.util.Scanner;

public class Program_Question1_2 extends Exercise2 {
    public static void main(String[] args) {
question1();
    }
    private static void question1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int sothunhat = scanner.nextInt();
        System.out.println("nhập vào số thứ hai: ");
        int soThuHai = scanner.nextInt();
        try {
            System.out.println("Kết quả phép chia 2 số là: " + Exercise2.soTHuc(sothunhat, soThuHai));
        } catch (Exception e) {
            System.err.print("cannot divide 0");
        }
//        finally {
//            System.out.println("");
//            System.out.println("Exit");
//        }
    }

}

