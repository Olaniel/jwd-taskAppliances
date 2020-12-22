package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator implements Appliance {
	private int powerConsumption;
	private double freezerCapacity;
	private int overallCapacity;
	private int weight;
	private int height;
	private int width;

	public Refrigerator(int powerConsumption, double freezerCapacity, int overallCapacity, int weight, int height,
			int width) {
		this.powerConsumption = powerConsumption;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	public Refrigerator() {
	};

	public int getpowerConsumption() {
		return powerConsumption;
	}

	public double getfreezerCapacity() {
		return freezerCapacity;
	}

	public int getoverallCapacity() {
		return overallCapacity;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setpowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setfreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public void setoverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String toString() {
		return "Name is Refrigerator" + "\n Power Consumption is " + powerConsumption + "\n Weight is " + weight
				+ "\n Freezer Capacity is " + freezerCapacity + "\n Overall Capacity is " + overallCapacity
				+ "\n Height is " + height + "\n Width is " + width;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Refrigerator refrigerator = (Refrigerator) obj;
		if (Integer.compare(refrigerator.powerConsumption, powerConsumption) == 0
				&& Double.compare(refrigerator.freezerCapacity, freezerCapacity) == 0
				&& Integer.compare(refrigerator.overallCapacity, overallCapacity) == 0
				&& Integer.compare(refrigerator.height, height) == 0 && Integer.compare(refrigerator.weight, weight) == 0
				&& Integer.compare(refrigerator.width, width) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
	}

}
