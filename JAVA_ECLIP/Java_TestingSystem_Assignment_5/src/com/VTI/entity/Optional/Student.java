package com.VTI.entity.Optional;

public class Student implements  IStudent{
    private  int id;
    private  String name;
    private  int group;

    @Override
    public void diemdanh() {
        System.out.println("Nguyễn Văn A điểm danh");

        System.out.println("Nguyễn Văn B điểm danh");

        System.out.println("Nguyễn Văn C điểm danh");
    }

    @Override
    public void hocbai() {
        System.out.println("Nguyễn Văn A đang học bài");

        System.out.println("Nguyễn Văn B đang học bài");

        System.out.println("Nguyễn Văn C đang học bài");
    }

    @Override
    public void donVeSinh() {
        System.out.println("Nguyễn Văn A đang don ve sinh");

        System.out.println("Nguyễn Văn B đang don ve sinh");

        System.out.println("Nguyễn Văn C đang don ve sinh");

    }
}
