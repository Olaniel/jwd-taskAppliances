package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

	public List<String> takeAll() throws IOException {
		List<String> electronicsList = readFile();
		return electronicsList;
	}

	private List<String> readFile() throws IOException {
		String electronicsData = "";
		List<String> electronicsList = new ArrayList<>();
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader("appliances_db.txt");
			bufferedReader = new BufferedReader(fileReader);
			while ((electronicsData = bufferedReader.readLine()) != null) {
				electronicsList.add(electronicsData);
			}
		} catch (IOException e) {
			System.out.println("При чтении файла произошла ошибка");
		} finally {
			bufferedReader.close();
		}
		return electronicsList;
	}

}
