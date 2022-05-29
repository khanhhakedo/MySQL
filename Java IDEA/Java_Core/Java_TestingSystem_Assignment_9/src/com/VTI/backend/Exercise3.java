package com.VTI.backend;

import com.VTI.entity.CPU;
import com.VTI.entity.Car;
import com.VTI.entity.OuterClass;

public class Exercise3 {

    public static  void  Question1(){
        CPU cpu1 = new CPU();

        CPU.Processor processor = cpu1.new Processor();

        CPU.Ram ram = cpu1.new Ram ();

        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());

    }

    public static  void  Question2(){

        Car car  = new Car();
        car.setName("Mazda");
        car.setType("8WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");

        System.out.println("Thong tin xe: ");

        System.out.println("Name: " + car.getName() +"\n"+"Type: "+ car.getType() + " \n" + "EngineType: "+ engine.getEngineType());

    }

    public static  void  Question3(){
        OuterClass outerClass = new OuterClass();
        outerClass.show();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }
}
