package com.ownautoshop;

public class Ford extends Car {
	int year;
	static int manufacturerDiscount;

	/**
	 * constructor class
	 * 
	 * @param speed                - super property accessed of spped
	 * @param regularPrice         - super property accessed of regularprice
	 * @param color                - super property accessed of color
	 * @param year                 - super property accessed of year
	 * @param manufacturerDiscount - super property accessed of manufacturerDiscount
	 */
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		Ford.manufacturerDiscount = manufacturerDiscount;
	}

	/**
	 * method for getting salesprice of Ford
	 */
	public double getSalePrice() {
		return (super.getSalePrice() - manufacturerDiscount);
	}
}

