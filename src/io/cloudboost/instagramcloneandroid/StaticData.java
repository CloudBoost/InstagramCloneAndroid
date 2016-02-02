package io.cloudboost.instagramcloneandroid;

import java.util.Random;

public class StaticData {

	private static final Random RANDOM = new Random();

	public static int getRandomCheeseDrawable() {
		switch (RANDOM.nextInt(8)) {
		case 0:
			return R.drawable.sample_0;
		case 1:
			return R.drawable.sample_1;
		case 2:
			return R.drawable.sample_2;

		case 3:
			return R.drawable.sample_3;
		case 4:
			return R.drawable.sample_4;
		case 5:
			return R.drawable.sample_5;
		case 6:
			return R.drawable.sample_6;
		case 7:
			return R.drawable.sample_7;
		default:
			return R.drawable.sample_7;
		}
	}

	public static final String[] names = { "John Doe", "Nawaz Dhandala",
			"Bengi Egima", "Ranjeet Kumar", "Buhiire Ken", "Jane Daisy",
			"Bill Gates", "John Wick", "Barrack Obama" };

}
