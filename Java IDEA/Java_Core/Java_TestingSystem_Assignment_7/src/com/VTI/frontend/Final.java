package com.VTI.frontend;

import com.VTI.entity.Final.MyMath;
import com.VTI.entity.Final.Student;

public class Final {
    public static void main(String[] args) {

    MyMath myMath = new MyMath();
    System.out.println(myMath.Sum(3));

    Student student = new Student();
    student.hocBai();

    }
}
