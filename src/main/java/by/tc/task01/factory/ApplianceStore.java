package by.tc.task01.factory;

import java.util.List;

import by.tc.task01.entity.*;

public class ApplianceStore extends Store {

	@Override
	Appliance createElectronics(String type, List<String> requirements) {
		if (type == null || requirements == null) {
			return null;
		}
		switch (type) {
		case "Laptop":
			return new Laptop(Double.parseDouble(requirements.get(0)), requirements.get(1),
					Integer.parseInt((requirements.get(2))), Integer.parseInt(requirements.get(3)),
					Double.parseDouble(requirements.get(4)), Integer.parseInt(requirements.get(5)));
		case "Refrigerator":
			return new Refrigerator(Integer.parseInt(requirements.get(0)), Double.parseDouble(requirements.get(1)),
					Integer.parseInt(requirements.get(2)), Integer.parseInt(requirements.get(3)),
					Integer.parseInt(requirements.get(4)), Integer.parseInt(requirements.get(5)));
		case "Oven":
			return new Oven(Integer.parseInt(requirements.get(0)), Integer.parseInt(requirements.get(1)),
					Integer.parseInt(requirements.get(2)), Integer.parseInt(requirements.get(3)),
					Double.parseDouble(requirements.get(4)), Double.parseDouble(requirements.get(5)));
		case "Speakers":
			return new Speakers(Integer.parseInt(requirements.get(0)), Integer.parseInt(requirements.get(1)),
					requirements.get(2), Integer.parseInt(requirements.get(3)));
		case "TabletPC":
			return new TabletPC(Integer.parseInt(requirements.get(0)), Integer.parseInt(requirements.get(1)),
					Integer.parseInt(requirements.get(2)), Integer.parseInt(requirements.get(3)), requirements.get(4));
		case "VacuumCleaner":
			return new VacuumCleaner(Integer.parseInt(requirements.get(0)), requirements.get(1), requirements.get(2),
					requirements.get(3), Integer.parseInt(requirements.get(4)), Integer.parseInt(requirements.get(5)));
		default:
			return null;
		}
	}

}
