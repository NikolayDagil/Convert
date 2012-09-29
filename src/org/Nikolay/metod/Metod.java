package org.Nikolay.metod;

public class Metod {

	public static double gradus(double a, String x) {

		double temp = 0;

		if (x.equals("k")) {
			temp = a + 273;
		} else if (x.equals("f")) {
			temp = a * 1.8 + 32;
		}

		return temp;
	}

	public double convertTemper(double a, String x, String y) {

		double temp = 0;

		switch (x) {
		case "K":

			switch (y) {
			case "F":
				temp = a * 1.8 - 460;
				break;
			case "C":
				temp = a - 273;
				break;
			}
			return temp;

		case "F":

			switch (y) {
			case "C":
				temp = (a - 32) * (5 / 9);
			case "K":
				temp = (a + 460) * (5 / 9);
			}
			return temp;

		case "C":

			switch (y) {
			case "F":
				temp = a * 1.8 + 32;
			case "K":
				temp = a + 273;
			}
			return temp;
		}
		return temp;
	}
}