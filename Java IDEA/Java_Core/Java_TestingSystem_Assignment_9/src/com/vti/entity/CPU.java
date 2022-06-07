package com.vti.entity;

public class CPU {

    private  float price;
    private Processor processor;
    private Ram ram;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public class Processor {
        private int coreAmount;
        private String menufacturer;


        public Processor(int coreAmount, String menufacturer) {
            super();
            this.coreAmount = coreAmount;
            this.menufacturer = menufacturer;
        }

        public Processor() {
        }

        public int getCoreAmount() {
            return coreAmount;
        }

        public void setCoreAmount(int coreAmount) {
            this.coreAmount = coreAmount;
        }

        public String getMenufacturer() {
            return menufacturer;
        }

        public void setMenufacturer(String menufacturer) {
            this.menufacturer = menufacturer;
        }

        public Double getCache() {
            return 4.3;
        }

    }

    public class Ram {

        private int memory;
        private String menufacturer;

        public Ram(int memory, String menufacturer) {
            this.memory = memory;
            this.menufacturer = menufacturer;
        }

        public Ram() {

        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getMenufacturer() {
            return menufacturer;
        }

        public void setMenufacturer(String menufacturer) {
            this.menufacturer = menufacturer;
        }

        public double getClockSpeed() {
            return 5.5;
        }
    }
}
