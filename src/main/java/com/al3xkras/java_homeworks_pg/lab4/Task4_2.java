package com.al3xkras.java_homeworks_pg.lab4;

import java.util.Arrays;

public class Task4_2 {

    public static interface CanScan{
        void scan();
    }

    public static interface CanPrint{
        void print();
    }

    public static abstract class PoweredDevice{
        private String name;
        private double voltage;
        boolean state;

        public PoweredDevice(String name, double voltage, boolean state) {
            this.name = name;
            this.voltage = voltage;
            this.state = state;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getVoltage() {
            return voltage;
        }

        public void setVoltage(double voltage) {
            this.voltage = voltage;
        }

        public boolean getState() {
            return state;
        }

        public void setState(boolean state) {
            this.state = state;
        }

        abstract void switchOn();
        abstract void switchOff();

        @Override
        public String toString() {
            return "PoweredDevice{" +
                    "name='" + name + '\'' +
                    ", voltage=" + voltage +
                    ", state=" + state +
                    '}';
        }
    }

    public static class Scanner extends PoweredDevice
            implements CanScan {

        public Scanner(double voltage, boolean state) {
            super("scanner", voltage, state);
        }

        @Override
        void switchOn() {
            System.out.println(getName()+" is on");
            this.setState(true);
        }

        @Override
        void switchOff() {
            System.out.println(getName()+" is off");
            this.setState(false);
        }

        @Override
        public void scan() {
            System.out.println("scanner is scanning");
        }
    }

    public static class Printer extends PoweredDevice
            implements CanPrint{

        public Printer(double voltage, boolean state) {
            super("printer", voltage, state);
        }

        @Override
        public void print() {
            System.out.println("printer is printing");
        }

        @Override
        void switchOn() {
            System.out.println(getName()+" is on");
            this.setState(true);
        }

        @Override
        void switchOff() {
            System.out.println(getName()+" is off");
            this.setState(false);
        }
    }

    public static class Copier extends PoweredDevice implements CanPrint,CanScan {

        public Copier(double voltage, boolean state) {
            super("copier", voltage, state);
        }

        @Override
        public void scan() {
            System.out.println("copier is scanning");
        }

        @Override
        public void print() {
            System.out.println("copier is printing");
        }

        @Override
        void switchOn() {
            System.out.println(getName()+" is on");
            this.setState(true);
        }

        @Override
        void switchOff() {
            System.out.println(getName()+" is off");
            this.setState(false);
        }
    }

    public static class DeviceDemo{
        public static void main(String[] args) {
            Copier copier = new Copier(15.2,false);
            Printer printer = new Printer(5.2,false);
            Scanner scanner = new Scanner(10,true);

            copier.switchOn();
            copier.scan();
            copier.print();
            copier.switchOff();

            scanner.switchOn();
            scanner.scan();
            scanner.switchOff();

            printer.switchOn();
            printer.print();
            printer.switchOff();

            System.out.println(Arrays.asList(
                    copier,printer,scanner
            ));
        }
    }
}
