package com.VTI.entity;

import java.util.Arrays;

public class StudentExercise3<T>{
    private T id;
    private static  int Count = 0;
    private int a ;
    private String name;

    private  T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public StudentExercise3() {
    }

    public StudentExercise3(String name, T[] array) {

        this.name = name;
        this.array = array;
    }

    public StudentExercise3(T id, String name) {
        this.id = id;
        this.name = name;
        this.a = ++Count;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "StudentExercise"+ a+": " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
