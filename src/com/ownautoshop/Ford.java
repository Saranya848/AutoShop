package com.ownautoshop;

public class Ford extends Car {
	int year;
	static int manufacturerDiscount;

	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		Ford.manufacturerDiscount = manufacturerDiscount;
	}

	public static double getSalePrice(double regularPrice) {
		return (Car.getSalePrice(regularPrice) - manufacturerDiscount);
	}
}
