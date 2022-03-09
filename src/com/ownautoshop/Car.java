package com.ownautoshop;

public class Car {
	private int speed;
	private double regularPrice;
	private String color;

	/**
	 * getter method for color of the car
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * setter method for color of the car
	 * 
	 * @param color - color of car
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * getter method for Price of the car
	 * 
	 * @return
	 */
	public double getRegularPrice() {
		return regularPrice;
	}

	/**
	 * setter method for Price of the car
	 * 
	 * @param regularPrice - actual price of item
	 */
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	/**
	 * getter method for Speed of the car
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * setter method for Speed of the car
	 * 
	 * @param speed - speed of the vechicle
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * Contructor class
	 * 
	 * @param speed        - speed of the Vechicle
	 * @param regularPrice - acutal cost
	 * @param color        - different colors
	 */
	public Car(int speed, double regularPrice, String color) {
		super();
		this.setSpeed(speed);
		this.setRegularPrice(regularPrice);
		this.setColor(color);
	}

	/**
	 * method for getsalesprice
	 * 
	 * @return
	 */
	public double getSalePrice() {
		return regularPrice;

	}
}
