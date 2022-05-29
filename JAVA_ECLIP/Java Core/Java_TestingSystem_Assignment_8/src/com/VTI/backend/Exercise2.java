package com.VTI.backend;

import com.VTI.entity.StudentExercise1;
import com.VTI.entity.StudentExercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    public static void Question1(){

        List<StudentExercise2> students = new ArrayList<>();

        StudentExercise2 studentExercise1 = new StudentExercise2("Khanh1");
        students.add(studentExercise1);

        StudentExercise2 studentExercise2 = new StudentExercise2("hhanh2");
        students.add(studentExercise2);

        StudentExercise2 studentExercise3 = new StudentExercise2("thanh3");
        students.add(studentExercise3);

        StudentExercise2 studentExercise4 = new StudentExercise2("Ahanh4");
        students.add(studentExercise4);



		Collections.sort(Arrays.asList(students), new StudentExercise2());

		for (StudentExercise2 studentExercise : students) {
			System.out.println(students);
		}
    }
}
