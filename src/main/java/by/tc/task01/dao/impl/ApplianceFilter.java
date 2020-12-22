package by.tc.task01.dao.impl;

import java.util.List;

import by.tc.task01.entity.criteria.Criteria;

public class ApplianceFilter {

	public String filter(List<String> applianceData, Criteria criteria) {
		boolean isFind;
		String mainPatternSpecification;
		String patternSpecification = "";
		for (String electronicSpecification : applianceData) {
			isFind = true;
			if (electronicSpecification.contains(criteria.getGroupSearchName())) {
				for (String requare : criteria.keySet()) {
					mainPatternSpecification = requare + "=" + criteria.getValue(requare) + ",";
					patternSpecification = "" + criteria.getValue(requare);
					if (!electronicSpecification.contains(mainPatternSpecification)
							& !patternSpecification.equals(electronicSpecification
									.substring(electronicSpecification.length() - patternSpecification.length())
									.trim())) {
						isFind = false;
						break;
					}
				}
			} else {
				isFind = false;
			}
			if (isFind) {
				return electronicSpecification;
			}
		}
		return null;
	}

}
