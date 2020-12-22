package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.IOException;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws IOException {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);
		appliance = service.find(criteriaOven);
		PrintApplianceInfo.print(appliance);


		//////////////////////////////////////////////////////////////////
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(),"blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
		appliance = service.find(criteriaTabletPC);// find(Object...obj)
		PrintApplianceInfo.print(appliance);
		
		
        //////////////////////////////////////////////////////////////////
		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY.toString(),1500);
		criteriaLaptop.add(Laptop.MEMORY_ROM.toString(), -8000);
		criteriaLaptop.add(Laptop.OS.toString(), "Windows");
		appliance = service.find(criteriaLaptop);// find(Object...obj)
		PrintApplianceInfo.print(appliance);

	}

}
