package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.List;

public class SpecificationCreator {

	public List<String> createSpecificationList(String electronicSpecification) {
		if (electronicSpecification == null) {
			return null;
		} else {
			List<String> resultList = createResList(electronicSpecification);
			return resultList;
		}
	}

	private List<String> createResList(String electronicSpecification) {
		electronicSpecification = "," + electronicSpecification;
		String arr[] = electronicSpecification.split(",[^=]*=");
		List<String> list = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
	// you may add your own code here
}
