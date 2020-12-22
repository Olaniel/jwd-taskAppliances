package by.tc.task01.factory;

import java.util.List;

import by.tc.task01.entity.Appliance;

public abstract class Store{
	
	public Appliance orderElectronics(String type,List<String> requirements) {
		Appliance electronics;
		electronics=createElectronics(type,requirements);
		return electronics;
	}
	
	abstract Appliance createElectronics(String type,List<String> requirements);
	

}
