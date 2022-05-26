package com.VTI.backend;

import com.VTI.entity.Student;

import javax.print.attribute.standard.QueuedJobCount;
import java.util.*;

public class Exercise1 {
    public static void Question1() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("khanh1"));

        students.add(new Student("khanh1"));

        students.add(new Student("khanh1"));

        students.add(new Student("khanh2"));

        students.add(new Student("khanh3"));

        System.out.println("cau a");
        System.out.println(students.size());
        System.out.println("------------------");

        System.out.println("cau b");
        System.out.println(students.get(3));
        System.out.println("------------------");

        System.out.println("cau c");
        System.out.println("Phan tu dau la: " + students.get(0));
        System.out.println("------------------");

        System.out.println("cau d");
        System.out.println("Phan tu cuoi la: " + students.get(students.size() - 1));
        System.out.println("------------------");


        System.out.println("cau d");
        students.add(0, new Student("khanh4"));
        System.out.println("Phan tu dau la: " + students.get(0));
        System.out.println("------------------");

        System.out.println("cau e");
        students.add(new Student("khanh5"));
        System.out.println("Phan tu cuoi la: " + students.get(students.size() - 1));
        System.out.println("------------------");

        System.out.println("cau f");
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------------");
//
//        System.out.println("cau g");
//        for (Student student: students) {
//            if (student.getId() == 4){
//                return = student;
//            }
//            }return null;
//
//        }
//        System.out.println("------------------");
//
//        System.out.println("cau h");
//        for (Student student: students) {
//            if (student.getName() == "khanh4") {
//                System.out.println(student);
//            }
//            System.out.println(student);
//            break;
//        }
//        System.out.println("------------------");
//
////        System.out.println("cau i");
//
//        System.out.println("cau j");
//        for (Student student : students) {
//            if (student.getId() == 2) {
//                student.setName(null);
//            } break;
//        }
//
//        for (Student studentj:students) {
//            System.out.println(studentj);
//        }
//

    }
    public static void Question2_a () {
        try {
            Stack<Student> students = new Stack<>();
            students.push(new Student("Nguyễn Văn Nam"));
            students.push(new Student("Nguyễn Văn Huyên"));
            students.push(new Student("Trần Văn Nam"));
            students.push(new Student("Nguyễn Văn A"));

            for (int i = 0; i < students.size(); i--) {
                System.out.println(students.pop());
            }
        } catch (Exception ex){
            System.out.println("------------------------");
        }
    }

    public static void Question2_b () {
        try {
            Queue<Student> students = new LinkedList<Student>(); {
            } {
            };
            students.offer(new Student("Nguyễn Văn Nam"));
            students.offer(new Student("Nguyễn Văn Huyên"));
            students.offer(new Student("Trần Văn Nam"));
            students.offer(new Student("Nguyễn Văn A"));

            Student current;

            while((current = students.poll())!= null) {
                System.out.println(current);
            }

        } catch (Exception ex){
            System.out.println("Loi mat roi ! Xem lai Code");
        }


    }
}


