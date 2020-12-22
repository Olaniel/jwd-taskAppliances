package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC implements Appliance {
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;

	public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public TabletPC() {
	};

	public int getbatteryCapacity() {
		return batteryCapacity;
	}

	public int getdisplayInches() {
		return displayInches;
	}

	public int getmemoryRom() {
		return memoryRom;
	}

	public int getflashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setbatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setdisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public void setmemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public void setflashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Name is TablePC" + "\n Battery Capacity is " + batteryCapacity + "\n Display Inches is " + displayInches
				+ "\n Memory Rom is " + memoryRom + "\n Flash Memory Capacity is " + flashMemoryCapacity
				+ "\n Color is " + color;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		TabletPC tabletPC = (TabletPC) obj;
		if (Integer.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
				&& Integer.compare(tabletPC.displayInches, displayInches) == 0 && tabletPC.color.equals(color)
				&& Integer.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
				&& Integer.compare(tabletPC.memoryRom, memoryRom) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
	}
}
