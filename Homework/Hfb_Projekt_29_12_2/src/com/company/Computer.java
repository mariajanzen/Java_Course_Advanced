package com.company;

import sun.awt.image.OffScreenImageSource;

public class Computer {
    CPU cpu;
    RAM ram;
    HDD hdd;

    public Computer(CPU cpu, RAM ram, HDD hdd){
        this.cpu=cpu;
        this.hdd=hdd;
        this.ram=ram;
    }

    public String toString(){
        return cpu.toString()+"\n"+ram.toString()+"\n"+hdd.toString()+"\n";
    }

    public double getPriceCPU(CPU cpu){
        return cpu.price;
    }

    public double getPriceRAM(RAM ram) {
        return ram.price;
    }

    public double getPriceHDD(HDD hdd) {
        return hdd.price;
    }

    public double getPriceComputer(){
        return getPriceRAM(ram)+getPriceCPU(cpu)+getPriceHDD(hdd);
    }

    public int compareTo(Computer computer){
        if (this.getPriceComputer()>computer.getPriceComputer()) return 1;
        if (this.getPriceComputer()<computer.getPriceComputer()) return -1;
        return 0;
    }

    public void compareTo2(Computer computer){
        int compare= this.cpu.compareTo(computer.cpu.frequency);
        System.out.println("The CPU:\n"+this.cpu);
        if (compare != 0) {
            System.out.println((compare > 0) ? "is more than" : "is less than");
        } else {
            System.out.println("is equal to");
        }
        System.out.println("CPU:\n" +computer.cpu);
    }

}
