package by.tc.task01.entity;

import java.util.Objects;

public class Oven implements Appliance {
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double width;

	public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	public Oven() {
	};

	public int getpowerConsumption() {
		return powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setpowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String toString() {
		return "Name is Oven" + "\n Power Consumption is " + powerConsumption + "\n Weight is " + weight
				+ "\n Capacity is " + capacity + "\n Depth is " + depth + "\n Height is " + height + "\n Width is "
				+ width;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Oven oven = (Oven) obj;
		if (Integer.compare(oven.powerConsumption, powerConsumption) == 0 && Integer.compare(oven.weight, weight) == 0
				&& Integer.compare(oven.capacity, capacity) == 0 && Integer.compare(oven.depth, depth) == 0
				&& Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(powerConsumption, weight, capacity, depth, height);
	}
}
