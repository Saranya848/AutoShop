package com.ownautoshop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		/**
		 * Creating an instance of classes
		 * Using super method
		 * Displaying Sales price
		 */
		
		/**
		 * 1. Creating an instance of Sedan class and initialize all the fields with appropriate
		 *    values.
		 * 2. Using super(...) method in the constructor for initializing the fields of the
		 *    superclass.
		 * 3. Displaying Sales price of all objects we have created
		 */
		Sedan sedan=new Sedan(320, 40000, "Blue", 20);
		System.out.println("Sedan Price is : "+ sedan.getSalePrice());
		
		/**
		 * 4. Create two instances of the Ford class and initialize all the fields with appropriate
		 *    values.
		 * 5. Using super(...) method in the constructor for initializing the fields of the
		 *    super class.
		 * 6. Displaying Sales price of all objects we have created
		 */
		Ford ford=new Ford(526, 7652.0, "RED", 2015, 10);
		System.out.println("Ford Price is : "+ford.getSalePrice());
		
		/**
		 * 7. Creating an instance of Car class and initialize all the fields with appropriate values.
		 * 8. Displaying Sales price of all objects we have created
		 */
		Car car=new Car(685, 68856.0, "Purple");
		System.out.println("Car Price is : "+car.getSalePrice());
	}

}
