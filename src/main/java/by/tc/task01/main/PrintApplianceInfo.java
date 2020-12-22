package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if(appliance!=null){
		System.out.println("-----------------------------------------");
		System.out.println(appliance.toString());
		System.out.println("-----------------------------------------");
		}else {
			System.out.println("-----------------------------------------");
			System.out.println("Товар с данными параметрами не найден!");
			System.out.println("-----------------------------------------");
		}
	}
	
	// you may add your own code here

}
