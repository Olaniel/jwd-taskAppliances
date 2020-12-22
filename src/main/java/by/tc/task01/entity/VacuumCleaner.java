package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance{
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner(int powerConsumption,String filterType,String bagType,String wandType,int motorSpeedRegulation,int cleaningWidth) {
		this.powerConsumption=powerConsumption;
		this.filterType=filterType;
		this.bagType=bagType;
		this.wandType=wandType;
		this.motorSpeedRegulation=motorSpeedRegulation;
		this.cleaningWidth=cleaningWidth;
	}
	
	public VacuumCleaner() {};
	
	public int getpowerConsumption() {
		return powerConsumption;
	}

	public String getfilterType() {
		return filterType;
	}

	public String getbagType() {
		return bagType;
	}

	public String getwandType() {
		return wandType;
	}

	public int getmotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public int getcleaningWidth() {
		return cleaningWidth;
	}
	
	
	public void setpowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setfilterType(String filterType) {
		this.filterType = filterType;
	}

	public void setbagType(String bagType) {
		this.bagType = bagType;
	}

	public void setwandType(String wandType) {
		this.wandType = wandType;
	}

	public void setmotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public void setcleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	public String toString() {
		return "Name is Refrigerator" +"\n Power Consumption is "+powerConsumption+"\n Filter Type is "+filterType 
				+"\n Bag Type is "+bagType + "\n Wand Type is "+wandType+
				"\n Motor Speed Regulation is "+motorSpeedRegulation+"\n Cleaning Width is "+cleaningWidth;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		VacuumCleaner vacuumCleaner = (VacuumCleaner) obj;
		if (Integer.compare(vacuumCleaner.powerConsumption, powerConsumption) == 0
				&& Integer.compare(vacuumCleaner.motorSpeedRegulation, motorSpeedRegulation) == 0 && vacuumCleaner.filterType==filterType
				&& Integer.compare(vacuumCleaner.cleaningWidth, cleaningWidth) == 0
				&& vacuumCleaner.bagType.equals(bagType) && vacuumCleaner.wandType.equals(wandType))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation,cleaningWidth);
	}
}
