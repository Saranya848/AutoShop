package com.ownautoshop;

public class Sedan extends Car {
	
	/**
	 * Constructor class of Sedan
	 * @param speed                - super property accessed of spped
	 * @param regularPrice         - super property accessed of regularprice
	 * @param color                - super property accessed of color
	 * @param length - Length of the Sedan
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		Sedan.length = length;
	}
	static int length;
	/**
	 * method for getting salesprice of Sedan
	 * @param regularPrice
	 * @return
	 */
	public double getSalePrice(double regularPrice) {
		double sales;
		if (length > 20) {
			sales = super.getSalePrice() - (0.05 * super.getSalePrice());
			return sales;
		} else
			sales = super.getSalePrice() - (0.1 * super.getSalePrice());
		return sales;
	}
}
