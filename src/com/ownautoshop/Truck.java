package com.ownautoshop;

/**
 * Truck extends Car to obtain properties of super class Method for updated
 * getsaleprice Calling updated getSaleprice method
 * 
 * @author king
 *
 */
public class Truck extends Car {
	private static int weight;
	static double sales;

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		Truck.weight = weight;
	}

	/**
	 * Method for updated getsaleprice
	 * 
	 * Condition applied according to thier weight
	 * 
	 * @param regularPrice - actual price
	 * @return
	 */
	public double getSalePrice() {
		if (weight > 2000) {
			sales = super.getSalePrice() - (0.1 * super.getSalePrice());
			System.out.println(sales);
		} else
			sales = super.getSalePrice() - (0.1 * super.getSalePrice());
		System.out.println(sales);
		return 0;
	}

}
