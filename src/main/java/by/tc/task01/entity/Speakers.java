package by.tc.task01.entity;

import java.util.Objects;

public class Speakers implements Appliance {
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;

	public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public Speakers() {
	};

	public int getpowerConsumption() {
		return powerConsumption;
	}

	public int getnumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public String getfrequencyRange() {
		return frequencyRange;
	}

	public int getcordLength() {
		return cordLength;
	}

	public void setpowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setnumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public void setfrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public void setcordLength(int cordLength) {
		this.cordLength = cordLength;
	}

	public String toString() {
		return "Name is Refrigerator" + "\n Power Consumption is " + powerConsumption + "\n Number Of Speakers is "
				+ numberOfSpeakers + "\n Frequency Range is " + frequencyRange + "\n Cord Length is " + cordLength;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Speakers speakers = (Speakers) obj;
		if (Integer.compare(speakers.powerConsumption, powerConsumption) == 0
				&& Integer.compare(speakers.numberOfSpeakers,numberOfSpeakers)==0 && speakers.frequencyRange.equals(frequencyRange)
				&& Integer.compare(speakers.cordLength, cordLength) == 0)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
	}

}
