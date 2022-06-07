package com.vti.frontend.Exercise2;

public class Question3 {
    public static void main(String[] args) {
        int[] ints = { 1,3,6,8};
        try {
            System.out.println(ints[10]);
        } catch (Exception e) {
            System.err.print("Loi mat roi");
        }
    }
}
