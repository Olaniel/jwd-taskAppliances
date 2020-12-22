package by.tc.task01.dao.impl;


import java.io.IOException;
import java.util.List;
import by.tc.task01.dao.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.factory.ApplianceStore;
import by.tc.task01.factory.Store;
import by.tc.task01.dao.impl.ApplianceDAOImpl;

public class ApplianceDAOImpl implements ApplianceDAO {

	public Appliance find(Criteria criteria) throws IOException {

		ApplianceReader applianceReader = new ApplianceReader();
		List<String> applianceData = applianceReader.takeAll();

		ApplianceFilter applianceFilter = new ApplianceFilter();
		String electronicSpecification = applianceFilter.filter(applianceData, criteria);

		SpecificationCreator specificationCreator = new SpecificationCreator();
		List<String> specificationList=specificationCreator.createSpecificationList(electronicSpecification);

		Store electronicStore = new ApplianceStore();
		Appliance electronic = electronicStore.orderElectronics(criteria.getGroupSearchName(),specificationList);
		
		return electronic;
	}
}

//you may add your own new classes