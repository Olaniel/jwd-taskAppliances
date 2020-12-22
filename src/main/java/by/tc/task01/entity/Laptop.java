package by.tc.task01.entity;

import java.util.Objects;

public class Laptop implements Appliance {
	private double batteryCapacity;
	private String os;
	private int memoryRom;
	private int systemMemory;
	private double cpu;
	private int displayInchs;

	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInchs) {
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	public Laptop() {
	}

	public double getbatteryCapacity() {
		return batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setbatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setmemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public void setsystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public void setdisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}

	public int getmemoryRom() {
		return memoryRom;
	}

	public int getsystemMemory() {
		return systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public int getdisplayInchs() {
		return displayInchs;
	}

	public String toString() {
		return "Name is Laptop" + "\n Battery Capacity is " + batteryCapacity + "\n OS is " + os + "\n Memory Rom is "
				+ memoryRom + "\n System Memory is " + systemMemory + "\n CPU is " + cpu + "\n Display Inchs is "
				+ displayInchs;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Laptop laptop = (Laptop) obj;
		if (Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
				&& Integer.compare(laptop.memoryRom, memoryRom) == 0
				&& Integer.compare(laptop.systemMemory, systemMemory) == 0 && Double.compare(laptop.cpu, cpu) == 0
				&& Integer.compare(laptop.displayInchs, displayInchs) == 0 && laptop.os.equals(os))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
	}

}
