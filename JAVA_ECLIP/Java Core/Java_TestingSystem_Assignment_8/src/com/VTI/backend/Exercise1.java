package com.VTI.backend;

import com.VTI.entity.StudentExercise1;

import java.util.*;

public class Exercise1 {
    public static void Question1() {
        List<StudentExercise1> students = new ArrayList<>();
        students.add(new StudentExercise1("khanh1"));

        students.add(new StudentExercise1("khanh1"));

        students.add(new StudentExercise1("khanh1"));

        students.add(new StudentExercise1("khanh2"));

        students.add(new StudentExercise1("khanh3"));

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
        students.add(0, new StudentExercise1("khanh4"));
        System.out.println("Phan tu dau la: " + students.get(0));
        System.out.println("------------------");

        System.out.println("cau e");
        students.add(new StudentExercise1("khanh5"));
        System.out.println("Phan tu cuoi la: " + students.get(students.size() - 1));
        System.out.println("------------------");

        System.out.println("cau f");
        Collections.reverse(students);
        for (StudentExercise1 student : students) {
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
            Stack<StudentExercise1> students = new Stack<>();
            students.push(new StudentExercise1("Nguyễn Văn Nam"));
            students.push(new StudentExercise1("Nguyễn Văn Huyên"));
            students.push(new StudentExercise1("Trần Văn Nam"));
            students.push(new StudentExercise1("Nguyễn Văn A"));

            for (int i = 0; i < students.size(); i--) {
                System.out.println(students.pop());
            }
        } catch (Exception ex){
            System.out.println("------------------------");
        }
    }

    public static void Question2_b () {
        try {
            Queue<StudentExercise1> students = new LinkedList<StudentExercise1>(); {
            } {
            };
            students.offer(new StudentExercise1("Nguyễn Văn Nam"));
            students.offer(new StudentExercise1("Nguyễn Văn Huyên"));
            students.offer(new StudentExercise1("Trần Văn Nam"));
            students.offer(new StudentExercise1("Nguyễn Văn A"));

            StudentExercise1 current;

            while((current = students.poll())!= null) {
                System.out.println(current);
            }

        } catch (Exception ex){
            System.out.println("Loi mat roi ! Xem lai Code");
        }


    }

//    public static void Question3 () {
//        Set<Student> students = new HashSet<>();
//        students.add(new Student("khanh1"));
//
//        students.add(new Student("khanh2"));
//
//        students.add(new Student("khanh3"));
//
//        students.add(new Student("khanh4"));
//
//        students.add(new Student("khanh5"));
//
//        System.out.println("cau a");
//        System.out.println(students.size());
//        System.out.println("------------------");
//
//        System.out.println("cau b");
//        Iterator<Student> iteratorSetb = students.iterator();
////        for (int i = 0; i <= 2; i++) {
////            iteratorSetb.next();
////        }
////        System.out.println(iteratorSetb.next());
//
//        int a = 1;  while( iteratorSetb.hasNext()) {
//            System.out.println(iteratorSetb.next());
//            System.out.println(a);}
//
//
//        System.out.println("cau c");
//        System.out.println("Phan tu dau la: " + students.contains(0));
//        System.out.println("------------------");
//
//        System.out.println("cau d");
//        System.out.println("Phan tu cuoi la: " + students.contains(students.size() - 1));
//        System.out.println("------------------");
//
//
////        System.out.println("cau d");
////        students.add(0, new Student("khanh4"));
////        System.out.println("Phan tu dau la: " + students.contains(0));
////        System.out.println("------------------");
//
//        System.out.println("cau e");
//        students.add(new Student("khanh5"));
//        System.out.println("Phan tu cuoi la: " + students.contains(students.size() - 1));
//        System.out.println("------------------");
//
////        System.out.println("cau f");
////        Collections.reverse(students);
////        for (Student student : students) {
////            System.out.println(student);
////        }
//        System.out.println("------------------");
//    }

    public static void Question4 () {
        Set<StudentExercise1> students = new LinkedHashSet<>();
        students.add(new StudentExercise1("khanh1"));

        students.add(new StudentExercise1("khanh2"));

        students.add(new StudentExercise1("khanh3"));

        students.add(new StudentExercise1("khanh4"));

        students.add(new StudentExercise1("khanh5"));

        Iterator<StudentExercise1> studentIterator = students.iterator();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(studentIterator.next());
        }

    }

    public static void Question6_7 () {
        HashMap<Integer, StudentExercise1> students = new HashMap();
        StudentExercise1 student1 = new StudentExercise1("khanh1");
        students.put(student1.getId(), student1);

        StudentExercise1 student2 = new StudentExercise1("khanh2");
        students.put(student2.getId(), student2);

        StudentExercise1 student3 = new StudentExercise1("khanh3");
        students.put(student3.getId(), student3);

        StudentExercise1 student4 = new StudentExercise1("khanh4");
        students.put(student4.getId(), student3);

        System.out.println("cau a+ b");
        System.out.println("Các key trong Map:");
        for (Map.Entry<Integer, StudentExercise1> student : students.entrySet()) {
            System.out.println(student.getKey());

            System.out.println(" Value: " + student.getValue());
        }

        System.out.println("cau d");
        Set<Map.Entry<Integer, StudentExercise1>> entrySet = students.entrySet();

        Iterator<Map.Entry<Integer, StudentExercise1>> studentIterator1 = entrySet.iterator();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(studentIterator1.next());

        }

    }

}


