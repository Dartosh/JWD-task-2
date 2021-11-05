package by.klintsov.entity;

import java.util.Objects;

public class Laptop extends Device{
    private String cpu;
    private int ram;
    private float displayDiagonal;
    private int hardDiskMemory;

    public Laptop(String cpu, int ram, float displayDiagonal, int hardDiskMemory) {
        this.cpu = cpu;
        this.ram = ram;
        this.displayDiagonal = displayDiagonal;
        this.hardDiskMemory = hardDiskMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public float getDisplayDiagonal() {
        return displayDiagonal;
    }

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDisplayDiagonal(float displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public void setHardDiskMemory(int hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    @Override
    public String toString() {
        return "Laptop{\n" +
                "cost: " + getCost() + "\n" +
                "RAM: " + ram + "\n" +
                "Diagonal: " + displayDiagonal + "\n" +
                "Hard disk memory: " + hardDiskMemory + "\n" +
                "}";
    }

    @Override
    public int hashCode(){
        int result = cpu == null ? 0 : cpu.hashCode();
        int floatAsInt = (int) displayDiagonal;
        result = 31 * result + floatAsInt;
        result = 31 * result + ram;
        result = 31 * result + hardDiskMemory;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram
                && Float.compare(laptop.displayDiagonal, displayDiagonal) == 0
                && hardDiskMemory == laptop.hardDiskMemory
                && Objects.equals(cpu, laptop.cpu);
    }
}
