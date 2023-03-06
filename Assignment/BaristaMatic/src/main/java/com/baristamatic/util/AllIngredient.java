package com.baristamatic.util;


//////////////////////////////////////////////

class Cocoa extends IngredientService {

	public Cocoa() {
		super("Cocoa", 90);
	}

	@Override
	public IngredientService clone() {
		return new Cocoa();
	}

}

//////////////////////////////////////////////

class Coffee extends IngredientService {

	public Coffee() {
		super("Coffee", 75);
	}

	@Override
	public IngredientService clone() {
		return new Coffee();
	}

}

//////////////////////////////////////////////

class Cream extends IngredientService {

	public Cream() {
		super("Cream", 25);
	}

	@Override
	public IngredientService clone() {
		return new Cream();
	}

}


//////////////////////////////////////////////

class DecafCoffee extends IngredientService {

	public DecafCoffee() {
		super("Decaf Coffee", 75);
	}

	@Override
	public IngredientService clone() {
		return new DecafCoffee();
	}

}


//////////////////////////////////////////////


class Espresso extends IngredientService {

	public Espresso() {
		super("Espresso", 110);
	}

	@Override
	public IngredientService clone() {
		return new Espresso();
	}

}


//////////////////////////////////////////////


class FoamedMilk extends IngredientService {

	public FoamedMilk() {
		super("Foamed Milk", 35);
	}

	@Override
	public IngredientService clone() {
		return new FoamedMilk();
	}

}

//////////////////////////////////////////////

class SteamedMilk extends IngredientService {

	public SteamedMilk() {
		super("Steamed Milk", 35);
	}

	@Override
	public IngredientService clone() {
		return new SteamedMilk();
	}

}

//////////////////////////////////////////////

class Sugar extends IngredientService {

	public Sugar() {
		super("Sugar", 25);
	}

	@Override
	public IngredientService clone() {
		return new Sugar();
	}

}

//////////////////////////////////////////////

class WhippedCream extends IngredientService {

	public WhippedCream() {
		super("Whipped Cream", 100);
	}

	@Override
	public IngredientService clone() {
		return new WhippedCream();
	}

}

//////////////////////////////////////////////









