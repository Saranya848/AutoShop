package com.ownautoshop;

public class Sedan extends Car {
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		Sedan.length = length;
	}
	static int length;
	public static double getSalePrice(double regularPrice) {
		double sales;
		if (length > 20) {
			sales = Car.getSalePrice(regularPrice) - (0.05 * Car.getSalePrice(regularPrice));
			return sales;
		} else
			sales = Car.getSalePrice(regularPrice) - (0.1 * Car.getSalePrice(regularPrice));
		return sales;
	}
}
