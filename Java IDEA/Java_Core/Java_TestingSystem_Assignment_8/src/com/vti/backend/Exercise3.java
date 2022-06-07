package com.vti.backend;

import com.vti.entity.Employee;
import com.vti.entity.StudentExercise3;

public class Exercise3 {
    public static void Question1(){
        StudentExercise3<Integer> studentExercise1 = new StudentExercise3<Integer>(3,"khanh1");
        System.out.println(studentExercise1);

        StudentExercise3<Float> studentExercise2 = new StudentExercise3<Float>(3.4f,"khanh2");
        System.out.println(studentExercise2);

        StudentExercise3<Double> studentExercise3 = new StudentExercise3<Double>(3.6d,"khanh1");
        System.out.println(studentExercise3);

    }

    < T > void print(T a){
        System.out.println("gia tri cua a la: " + a);
    }


    public static void Question2(){
        Exercise3 exercise1 = new Exercise3();
        exercise1.print(1);

        Exercise3 exercise2 = new Exercise3();
        exercise2.print("khanh");

        Exercise3 exercise3 = new Exercise3();
        exercise3.print(3.4f);
    }


    public static void Question4(){

        Integer[] array1 = { 1,2 , 3};
        StudentExercise3<Integer> studentExercise1 = new StudentExercise3<Integer>("khanh1",array1);
        System.out.println(studentExercise1);

        Long[] array2 = { 11l, 12l, 13l };
        StudentExercise3<Long> studentExercise2 = new StudentExercise3<Long>("khanh1",array2);
        System.out.println(studentExercise2);

        Double[] array3= { 1.1d,  1.2d, 1.3d };
        StudentExercise3<Double> studentExercise3 = new StudentExercise3<Double>("khanh1",array3);
        System.out.println(studentExercise3);
        }

    public static void Question5(){
        Integer[] salary1 = { 1,2 , 3 };
        Employee<Integer> employee1 = new Employee<Integer>("khanh1",salary1);
        System.out.println(employee1);
        System.out.println("Luong gan day nhat la: "+salary1[salary1.length - 1]);

        Float[] salary2 = { 1.1f, 1.2f, 1.3f };
        Employee<Float> employee2 = new Employee<Float>("khanh2",salary2);
        System.out.println(employee2);
        System.out.println("Luong gan day nhat la: "+salary2[salary2.length - 1]);

        Double[] salary3 = { 1.1d,  1.2d, 1.3d };
        Employee<Double> employee3 = new Employee<Double>("khanh3",salary3);
        System.out.println(employee3);
        System.out.println("Luong gan day nhat la: "+salary3[salary3.length - 1]);
    }

    public static void Question6(){

    }

}
