package com.ownautoshop;

import java.util.*;

/**
 * Truck extends Car to obtain properties of super class
 * Method for updated getsaleprice
 * Calling updated getSaleprice method
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
	 * @param regularPrice - actual price
	 * @return
	 */
	public static double getSalePrice(double regularPrice) {
		if (weight > 2000) {
			sales = Car.getSalePrice(regularPrice) - (0.1 * Car.getSalePrice(regularPrice));
			return sales;
		} else
			sales = Car.getSalePrice(regularPrice) - (0.2 * Car.getSalePrice(regularPrice));
		return sales;
	}

	public static void main(System[] args) {
		Scanner sc = new Scanner(System.in);
		int regularPrice = sc.nextInt();
		
		/**
		 * Calling updated getSaleprice method
		 */
		getSalePrice(regularPrice);
		sc.close();
	}
}
