package com.vti.entity;

public class Car {

    private static String name;
    private static String type;
    private static  Engine engine;

    public Car() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Car.name = name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Car.type = type;
    }

    public static Engine getEngine() {
        return engine;
    }

    public static void setEngine(Engine engine) {
        Car.engine = engine;
    }

    public class Engine {
        private  String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public Engine() {

        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }

}
