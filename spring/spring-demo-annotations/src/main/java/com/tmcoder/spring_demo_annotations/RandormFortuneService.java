package com.tmcoder.spring_demo_annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandormFortuneService implements FortuneService {

	// create an aray of strings
	private String[] data = { "Beware of Wolf", "Diligence is the mother of good luck", "The journey is the reward" };

	// create a random number generator
	private Random myRandom = new Random();

	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);// get a random number based on the size of the array
		String theFortune = data[index];
		return theFortune;
	}

}
