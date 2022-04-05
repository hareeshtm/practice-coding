package com.tmcoder.activity5_di_annotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:/Users/HP/eclipse-workspace/spring/activity5-di-annotation/src/main/java/fortune-data.txt";

	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();

	public FileFortuneService() {
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from the file: " + theFile);
		System.out.println("File Exists: " + theFile.exists());

		// initialize arraylist
		theFortunes = new ArrayList<String>();

		// read fortunes from the file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;

	}

}
